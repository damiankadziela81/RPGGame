package com.eclipse.ec.repository;

import com.eclipse.ec.domain.ForestCharacter;

public class Troll extends Character implements ForestCharacter {
	private int magicAbility;

	public int getMagicAbility() {
		return magicAbility;
	}

	public void setMagicAbility(int magicAbility) {
		this.magicAbility = magicAbility;
	}

	@Override
	public String toString() {
		return "Troll [regenerationRate=" + magicAbility + ", " + super.toString() + "]";
	}

	
}
