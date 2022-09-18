package com.eclipse.ec.services;

import com.eclipse.ec.repository.Vampire;
import com.eclipse.ec.repository.Zombie;
import com.eclipse.ec.repository.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eclipse.ec.domain.Forest;
import com.eclipse.ec.domain.ForestCharacter;
import com.eclipse.ec.domain.ForestWithBoss;
import com.eclipse.ec.domain.MountainsCharacter;

public class ForestWithBossServices {

	private Map<String, MountainsCharacter> mountainEnemies;
	private Map<String, ForestCharacter> forestEnemies;

	public ForestWithBossServices() {
		this.mountainEnemies = new HashMap<>();
		this.mountainEnemies.put("Boss1", new Vampire());
		this.mountainEnemies.put("Boss2", new Vampire());

		this.forestEnemies = new HashMap<>();
		this.forestEnemies.put("Boss1", new Zombie());
		this.forestEnemies.put("Boss2", new Zombie());
	}

	public ForestWithBoss createForest(String placeName, String bossName) {
		
		ForestWithBoss forest;
		if(placeName.contains("forest")) {
			forest = new ForestWithBoss<ForestCharacter>();
			forest.setBoss(forestEnemies.get(bossName));
		} else {
			forest = new ForestWithBoss<MountainsCharacter>();
			forest.setBoss(mountainEnemies.get(bossName));
		}

		List<Character> e = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Zombie bossZombie = new Zombie();
			bossZombie.setRegenerationRate(1);
			bossZombie.setName("Boss Zombie " + i);
			e.add(bossZombie);
		}
		forest.setEnemies(e);
		System.out.println(forest.getEnemies());
		return forest;
	}

}
