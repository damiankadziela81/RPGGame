package com.eclipse.ec.repository;

import com.eclipse.ec.domain.MountainsCharacter;

public class Vampire extends Character implements MountainsCharacter {
	private int damagedBySun;
	
	public Vampire() {};
	
	public Vampire(int hitPoints, int initiative, String name, int damagedBySun) {
		super(hitPoints, initiative, name);
		this.damagedBySun = damagedBySun;
	}

	public int getDamagedBySun() {
		return damagedBySun;
	}

	public void setDamagedBySun(int damagedBySun) {
		this.damagedBySun = damagedBySun;
	}

	@Override
	public String toString() {
		return "Vampire [damagedBySun=" + damagedBySun + ", " + super.toString() + "]";
	}
	
}
