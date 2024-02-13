package no.hvl.dat102.oblig2.parenteser;

import java.util.Set;

public class ParentesSjekker {
	
	private static final Set<Character> STARTPARENTESER = Set.of('{', '(', '[', '<');
	private static final Set<Character> SLUTTPARENTESER = Set.of('}', ')', ']', '>');
	private static final Set<String>    PARENTESPAR = Set.of("{}", "()", "[]", "<>");
	
	public static boolean sjekkParenteser(String s) {
		StabelADT<Character> stabel = new TabellStabel<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{' || c == '[' || c == '(' || c == '<') {
				stabel.push(c);
			} else if (c == '}' || c == ']' || c == ')' || c == '>') {
				if (stabel.isEmpty()) {
					return false; //Mangler åpning
				}
				char opening = stabel.pop();
				if 	((c == ')' && opening != '(') || (c == ']' && opening != '[') || (c == '}' && opening != '{')) {
					return false;
				}
			}
		}
		return stabel.isEmpty();
		//TODO Ca. 10-15 kodelinjer her gir en komplett løsning
	}

	private static boolean erStartParentes(char c) {
		//TODO 1 kodelinje her
		return false;
	}
	
	private static boolean erSluttParentes(char c) {
		//TODO 1 kodelinje her
		return false;
	}
	
	private static boolean erParentesPar(char start, char slutt) {
		//TODO 1-2 kodelinje(r) her
		return false;
	}
}
