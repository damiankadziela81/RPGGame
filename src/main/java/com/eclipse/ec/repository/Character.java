package com.eclipse.ec.repository;

public class Character implements Comparable<Character> {
	private int hitPoints;
	private int initiative;
	private String name;

	public Character() {
		hitPoints = 2;
		initiative = 0;
		name = "John Doe";
	}

	public Character(int hitPoints, int initiative, String name) {
		this.hitPoints = hitPoints;
		this.initiative = initiative;
		this.name = name;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	// polimorfizm - setInitiative może być wywołany z int, String lub bez argumentu
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

	public void setInitiative(String initiative) {
		this.initiative = Integer.valueOf(initiative);
	}

	public void setInitiative() {
		this.initiative = 5;
	}

	public int getInitiative() {
		return initiative;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "hitPoints=" + hitPoints + ", initiative=" + initiative + ", name=" + name;
	}

	@Override
	public int compareTo(Character o) {
		if (this.initiative < o.initiative)	return 1;
		if (this.initiative > o.initiative)	return -1;
		return 0;
	}

}
