package fr.trxyy.alternative.alternative_api;

import java.util.ArrayList;
import java.util.List;

public class JVMArguments {

	private List<String> arguments;

	public JVMArguments(String[] argments) {
		this.arguments = new ArrayList<String>();
		for (int i = 0; i < argments.length; i++) {
			this.arguments.add(argments[i]);
		}
	}

	public List<String> getJVMArguments() {
		return this.arguments;
	}

}
