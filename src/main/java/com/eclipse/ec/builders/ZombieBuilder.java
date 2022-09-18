package com.eclipse.ec.builders;

import com.eclipse.ec.repository.Zombie;

public class ZombieBuilder {
	private Zombie zombie = new Zombie();
	
	public ZombieBuilder withRegenerator(int regenerate) {
		zombie.setRegenerationRate(regenerate);
		return this;
	}
	
	public ZombieBuilder withHitPoints(int hitPoints) {
		zombie.setHitPoints(hitPoints);
		return this;
	}
	
	public ZombieBuilder withInitiative(int initiative) {
		zombie.setInitiative(initiative);
		return this;
	}
	
	public ZombieBuilder withName(String name) {
		zombie.setName(name);
		return this;
	}
	
	public Zombie build() {
		return zombie;
	}
	
}
