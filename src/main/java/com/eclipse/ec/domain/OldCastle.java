package com.eclipse.ec.domain;

import java.util.Arrays;

import com.eclipse.ec.repository.Character;
import com.eclipse.ec.repository.Warrior;

public class OldCastle extends Place implements Occurrenable {
	private Character[] enemies;

	public OldCastle() {
	};

	public OldCastle(int enemiesAmount) {
		this.enemies = new Character[enemiesAmount];
	}

	public Character[] getEnemies() {
		return this.enemies;
	}

	public void setEnemies(Character[] enemies) {
		this.enemies = enemies;
	}

	public void setEnemies(Character character, int idx) {
		this.enemies[idx] = character;
	}

	@Override
	protected String getPlaceOfOccurrence() {
		return "Dark Forest";
	}

	@Override
	public String occurrenceAtTimeOfDay() {
		return "Dawn";
	}

	public void fightSequence(Warrior warrior) {
		fightGreetings();
		fightActual(enemies, warrior);
		fightOutcome(enemies, warrior);
	}

	private void fightGreetings() {
		System.out.println("Now you see " + enemies.length + " enemies.");
		System.out.println("Their names are: ");
		for (int i = 0; i < enemies.length; i++) {
			System.out.println(enemies[i].getName() + ", ");
			System.out.println(enemies[i]);
		}
		System.out.println();
		System.out.println("=======================================================================");
		System.out.println("Fight!");
	}

	private void fightActual(Character[] enemies, Warrior warrior) {

		Arrays.asList(enemies).forEach(enemy -> {
			if ((enemy.getInitiative()) <= warrior.getInitiative()) {
				int warriorHit = warrior.getHitPoints() - warrior.getWeapon().getExtraHit();
				int hp = enemy.getHitPoints() - warriorHit;
				enemy.setHitPoints(hp);
			} else {
				int hp = warrior.getHitPoints() - enemy.getHitPoints();
				System.out.println("You were wounded, HP = " + hp);
				warrior.setHitPoints(hp);
			}
		});
	}

	private void fightOutcome(Character[] enemies, Warrior warrior) {
		Arrays.asList(enemies).forEach(enemy -> {
			if (enemy.getHitPoints() <= 0) {
				System.out.println("You have defeated " + enemy.getName());
			}
		});
	}
}
