package com.eclipse.ec.repository;

import com.eclipse.ec.domain.ForestCharacter;

public class Zombie extends Character implements ForestCharacter {
	private int regenerationRate;

	public int getRegenerationRate() {
		return regenerationRate;
	}

	public void setRegenerationRate(int regenerationRate) {
		this.regenerationRate = regenerationRate;
	}

	@Override
	public String toString() {
		return "Zombie [regenerationRate=" + regenerationRate + ", " + super.toString() + "]";
	}

	
}
