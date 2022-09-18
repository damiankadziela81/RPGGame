package com.eclipse.ec.enums;

public enum Places {
	
	FOREST,
	GRAVEYARD,
	CASTLE,
	SWAMP;
	
	public boolean isZombiePlace() {
		return GRAVEYARD == this;
	}
	
	public boolean isVampirePlace() {
		return CASTLE == this;
	}

}
