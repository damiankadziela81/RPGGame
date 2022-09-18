package com.eclipse.ec.services;

import com.eclipse.ec.repository.Vampire;
import com.eclipse.ec.repository.Zombie;
import com.eclipse.ec.repository.Character;
import com.eclipse.ec.domain.Forest;

public class ForestServices {
	
	public Forest createForest() {
		Forest forest = new Forest(3);
		
		Vampire dracula = new Vampire();
		dracula.setHitPoints(2);
		dracula.setInitiative(20);
		dracula.setName("Dracula");
		dracula.setDamagedBySun(2);
		
		Vampire nosferatu = new Vampire(2,20, "Nosferatu", 1);
		
		Zombie dogZombie = new Zombie();
		dogZombie.setRegenerationRate(1);
		dogZombie.setName("Fluffy");
		
//		Character[] enemies = {dracula, dogZombie};
//		forest.setEnemies(enemies);
		
		forest.setEnemies(dracula, 0);
		forest.setEnemies(dogZombie, 1);
		forest.setEnemies(nosferatu, 2);
		
		return forest;
	}
	
}
