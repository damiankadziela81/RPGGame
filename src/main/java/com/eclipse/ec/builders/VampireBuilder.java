package com.eclipse.ec.builders;

import com.eclipse.ec.repository.Vampire;

public class VampireBuilder {
	private Vampire vampire = new Vampire();
	
	public VampireBuilder withSunDamage(int damagedBySun) {
		vampire.setDamagedBySun(damagedBySun);
		return this;
	}
	
	public VampireBuilder withHitPoints(int hitPoints) {
		vampire.setHitPoints(hitPoints);
		return this;
	}
	
	public VampireBuilder withInitiative(int initiative) {
		vampire.setInitiative(initiative);
		return this;
	}
	
	public VampireBuilder withName(String name) {
		vampire.setName(name);
		return this;
	}
	
	public Vampire build() {
		return vampire;
	}
	
}
