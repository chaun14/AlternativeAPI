package fr.trxyy.alternative.alternative_api.maintenance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import fr.trxyy.alternative.alternative_api.GameEngine;

public class GameMaintenance {

	public Maintenance maintenance;
	public GameEngine engine;
	public boolean block_access = false;

	public GameMaintenance(Maintenance enumMaintenance, GameEngine eng) {
		this.maintenance = enumMaintenance;
		this.engine = eng;
	}

	public String readMaintenance() throws IOException {
		URL oracle = new URL(this.engine.getGameLinks().getMaintenanceUrl());
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		String s = "";
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			s = inputLine;
		}
		in.close();
		return s;
	}

	public Maintenance getMaintenance() {
		return this.maintenance;
	}

	public void setMaintenance(Maintenance maintenance_) {
		this.maintenance = maintenance_;
	}

	public boolean isAccessBlocked() {
		return block_access;
	}

	public void setAccessBlocked(boolean blckd) {
		this.block_access = blckd;
	}

}
