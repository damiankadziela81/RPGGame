package com.eclipse.ec.services;

import com.eclipse.ec.repository.Vampire;
import com.eclipse.ec.repository.Zombie;
import com.eclipse.ec.repository.Character;
import com.eclipse.ec.repository.Troll;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.eclipse.ec.builders.TrollBuilder;
import com.eclipse.ec.builders.VampireBuilder;
import com.eclipse.ec.builders.ZombieBuilder;
import com.eclipse.ec.domain.Forest;
import com.eclipse.ec.domain.OldCastle;

public class OldCastleService {

	public OldCastle createSite() {
		OldCastle castle = new OldCastle();
		List<Character>characters = IntStream.range(0, 6)
				.mapToObj(idx -> {
			switch (idx % 3) {
				case 0: {
					var zombie = new ZombieBuilder()
							.withHitPoints(2)
							.withRegenerator(1)
							.withInitiative(2)
							.withName("Zbyszek")
							.build();
					return zombie;
				}
				case 1: {
					var vampire = new VampireBuilder()
							.withHitPoints(3)
							.withInitiative(2)
							.withSunDamage(1)
							.withName("Dracula")
							.build();
					return vampire;
				}
				case 2: {
					var troll = new TrollBuilder()
							.withHitPoints(1)
							.withInitiative(3)
							.withMagicAbility(1)
							.withName("Janek")
							.build();
					return troll;
				}
				default: return null;
			}
		}).collect(Collectors.toList());
				
//		castle.setEnemies(characters);
		castle.setEnemies(characters.toArray(Character[]::new));
		
		return castle;
			
		}

}
