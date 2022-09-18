package com.eclipse.ec.domain;

import java.util.List;

import com.eclipse.ec.repository.Character;
import com.eclipse.ec.repository.Warrior;

public class OldCastle2<T> extends Place implements Occurrenable {
	private List<Character> enemies;
	private T boss;

	public OldCastle2() {
	}

	public List<Character> getEnemies() {
		return enemies;
	}

	public void setEnemies(List<Character> enemies) {
		this.enemies = enemies;
	}

	public T getBoss() {
		return boss;
	}
	
	public void setBoss(T boss) {
		this.boss = boss;
	}

	@Override
	protected String getPlaceOfOccurrence() {
		return "Boss Forest";
	}

	@Override
	public String occurrenceAtTimeOfDay() {
		return "Noon";
	}

	public void fightSequence(Warrior warrior) {
		fightGreetings();
		fightActual(enemies, warrior);
		fightOutcome(enemies, warrior);
		fightWithBoss(warrior);
	}

	private void fightGreetings() {
		System.out.println("Now you see " + enemies.size() + " enemies.");
		System.out.println("Their names are: ");
		for (int i = 0; i < enemies.size(); i++) {
			System.out.println(enemies.get(i).getName() + ", ");
		}
		System.out.println();
		System.out.println("=======================================================================");
		System.out.println("Fight!");
	}

	private void fightActual(List<Character> enemies, Warrior warrior) {
		for (Character enemy : enemies) {
			if (warrior.compareTo(enemy) < 0) {
				int warriorHit = warrior.getHitPoints() + warrior.getWeapon().getExtraHit();
				int hp = enemy.getHitPoints() - warriorHit;
				enemy.setHitPoints(hp);
			} else {
				int hp = warrior.getHitPoints() - enemy.getHitPoints();
				System.out.println("You were wounded, HP = " + hp);
				warrior.setHitPoints(hp);
			}
		}
	}

	private void fightOutcome(List<Character> enemies, Warrior warrior) {
		for (Character enemy : enemies) {
			if (enemy.getHitPoints() <= 0) {
				System.out.println("You have defeated " + enemy);
			}
		}
	}
	
	private void fightWithBoss(Warrior warrior) {
		Character boss = (Character) this.boss;
        if (boss.getInitiative() <= warrior.getInitiative()) {
            int hp = boss.getHitPoints() - (warrior.getHitPoints() + warrior.getWeapon().getExtraHit());
            boss.setHitPoints(hp);
            if (boss.getHitPoints() < 0) {
                System.out.println("You have defeated BOSS");
            }
        } else {
            int hp = warrior.getHitPoints() - boss.getHitPoints();
            warrior.setHitPoints(hp);
            if (warrior.getHitPoints() < 0) {
                System.out.println("You are defeated");
            }
        }
	}
}
