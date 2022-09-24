package com.eclipse.ec;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class RegexTest {
	
	@Test
	public void regexTest1() {
		Pattern pattern = Pattern.compile("Sii", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Kurs Sii z Javy");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}
	
	@Test
	public void regexTest2() {
		String patternToFind = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"; //sprawdzenie e-maila
		Pattern pattern = Pattern.compile(patternToFind, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("JakisAdres@mail.complpl");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Email found");
		} else {
			System.out.println("Email not found");
		}
	}
}
