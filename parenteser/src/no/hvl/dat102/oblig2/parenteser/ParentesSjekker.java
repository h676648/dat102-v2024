package no.hvl.dat102.oblig2.parenteser;

import java.util.Set;

public class ParentesSjekker {
	
	private static final Set<Character> STARTPARENTESER = Set.of('{', '(', '[', '<');
	private static final Set<Character> SLUTTPARENTESER = Set.of('}', ')', ']', '>');
	private static final Set<String>    PARENTESPAR = Set.of("{}", "()", "[]", "<>");
	private static StabelADT<Character> stabel = new TabellStabel<>();
	public static boolean sjekkParenteser(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			erStartParentes(c);
			erSluttParentes(c);
			char opening = stabel.pop();
			return erParentesPar(opening, c);
		}
		return stabel.isEmpty();
		//TODO Ca. 10-15 kodelinjer her gir en komplett løsning
	}

	private static boolean erStartParentes(char c) {
		if (c == '{' || c == '[' || c == '(' || c == '<') {
			stabel.push(c);
		}
		//TODO 1 kodelinje her
		return false;
	}
	
	private static boolean erSluttParentes(char c) {
		if (c == '}' || c == ']' || c == ')' || c == '>') {
			if (stabel.isEmpty()) {
			return false;
			}
		}
		//TODO 1 kodelinje her
		return false;
	}
	
	private static boolean erParentesPar(char start, char slutt) {
		if ((slutt == ')' && start != '(' || slutt == ']' && start != '[' || slutt == '}' && start != '{' || slutt == '>' && start != '<')) {
			return false;
		} else {
			return true;
		}
		//TODO 1-2 kodelinje(r) her
	}
}
