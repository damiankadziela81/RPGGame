package com.eclipse.ec.builders;

import com.eclipse.ec.repository.Troll;

public class TrollBuilder {
	private Troll troll = new Troll();
	
	public TrollBuilder withMagicAbility(int magicAbility) {
		troll.setMagicAbility(magicAbility);
		return this;
	}
	
	public TrollBuilder withHitPoints(int hitPoints) {
		troll.setHitPoints(hitPoints);
		return this;
	}
	
	public TrollBuilder withInitiative(int initiative) {
		troll.setInitiative(initiative);
		return this;
	}
	
	public TrollBuilder withName(String name) {
		troll.setName(name);
		return this;
	}
	
	public Troll build() {
		return troll;
	}
	
}
