package com.eclipse.ec.domain;

public abstract class Place {

	public void showPlaceOfOccurrence() {
		String occurence = getPlaceOfOccurrence();
		System.out.println("Enemy occured in " + occurence + ".");
	}
	
	abstract protected String getPlaceOfOccurrence();
}
