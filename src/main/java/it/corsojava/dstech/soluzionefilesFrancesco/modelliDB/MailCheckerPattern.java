package it.corsojava.dstech.soluzionefilesFrancesco.modelliDB;

import java.util.regex.Pattern;

public class MailCheckerPattern {
private static final String PATTERN = "\\w+@\\w+\\.(it|com)"; 
	public static boolean check(String mail) {
		boolean matches = Pattern.matches(PATTERN, mail);
		return matches;
	}

}
