package fr.trxyy.alternative.alternative_api.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Logger {
	
	public static ArrayList<String> logLines = new ArrayList<String>();

	public static void log(String s) {
		System.out.println(getTime() + s);
		logLines.add(getTime() + s);
	}

	public static void err(String s) {
		System.err.println(getTime() + s);
		logLines.add(getTime() + "[ERROR]" + s);
	}

	public static String getTime() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		return "[" + sdf.format(cal.getTime()) + "]";
	}
	
	public static String getLines() {
		String s = "";
		for (int i = 0; i < logLines.size(); i++) {
			s = s + "\n" + logLines.get(i);
		}
		return s;
	}

}
