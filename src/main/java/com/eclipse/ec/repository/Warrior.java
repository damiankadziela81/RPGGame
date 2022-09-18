package com.eclipse.ec.repository;

import com.eclipse.ec.enums.Places;
import com.eclipse.ec.enums.Weapons;
import com.eclipse.ec.exceptions.ToShortWarriorNameException;

public class Warrior extends Character{
	private Weapons weapon;
	private Places visitedPlace;
	
	public Weapons getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapons weapon) {
		this.weapon = weapon;
	}
	public Places getVisitedPlace() {
		return visitedPlace;
	}
	public void setVisitedPlace(Places visitedPlace) {
		this.visitedPlace = visitedPlace;
	}
	
	public String getVisitedPlaceAsString() {
		return visitedPlace.name();
	}
	
	public void setVisitedPlaceAsString(String visitedPlace) {
		this.visitedPlace = Places.valueOf(visitedPlace);
	}
	
	public void setName(String name) {
		if (name.length() < 3) {
			throw new ToShortWarriorNameException();
		}
		super.setName(name);
	}
	@Override
	public String toString() {
		return "Warrior [weapon=" + weapon + ", visitedPlace=" + visitedPlace + ", " + super.toString()
				+ "]";
	}
	
	
}
