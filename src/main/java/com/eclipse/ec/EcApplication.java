package com.eclipse.ec;

import java.lang.reflect.Method;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eclipse.ec.repository.Character;
import com.eclipse.ec.repository.Vampire;
import com.eclipse.ec.repository.Warrior;
import com.eclipse.ec.domain.Forest;
import com.eclipse.ec.domain.ForestWithBoss;
import com.eclipse.ec.domain.OldCastle;
import com.eclipse.ec.enums.Places;
import com.eclipse.ec.enums.Weapons;
import com.eclipse.ec.exceptions.ToShortWarriorNameException;
import com.eclipse.ec.services.ForestServices;
import com.eclipse.ec.services.ForestWithBossServices;
import com.eclipse.ec.services.OldCastleService;

//@SpringBootApplication
public class EcApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(EcApplication.class, args);
//	}

	public static void main(String[] args) {
		/*
		 * Character zombie = new Character(); Character drac = new Vampire(); Vampire
		 * dracula = new Vampire();
		 * 
		 * zombie.setInitiative(); zombie.setInitiative("20");
		 * System.out.println(zombie.getInitiative());
		 * 
		 * drac.setInitiative(2); //drac.setDamagedBySun(2); <- to nie zadziała, bo drac
		 * jest Characterem gdzie nie ma tej motody, trzeba rzutować tak:
		 * ((Vampire)drac).setDamagedBySun(2); dracula.setDamagedBySun(2);
		 */
		Scanner scanner = new Scanner(System.in);
		Warrior warrior = new Warrior();
		System.out.println("Enter your warrior's name: ");
		while (warrior.getName().equals("John Doe")) {
			try {
				warrior.setName(scanner.nextLine());
				warrior.setVisitedPlace(Places.GRAVEYARD);
				warrior.setWeapon(Weapons.STICK);
				warrior.setHitPoints(10);
				warrior.setInitiative(1);
			} catch (Exception e) {
				System.out.println("Your warrior's name is too short");
			}
		}
		System.out.println("Your stats: " + warrior);
//		ForestServices forestService = new ForestServices();
//		Forest forestWithEnemies = forestService.createForest();
		
//		ForestWithBossServices forestService = new ForestWithBossServices();
//		ForestWithBoss forestWithEnemies = forestService.createForest("forest", "Boss1");
//		forestWithEnemies.fightSequence(warrior);
		
		OldCastleService forestService = new OldCastleService();
		OldCastle forest = forestService.createSite();
		forest.fightSequence(warrior);
		

	}

	public static void getClassNameAndItsMethods() {
		Character enemy = new Vampire();
		Class clazz = enemy.getClass();
		System.out.println(clazz.getSimpleName());
		// wyswietlanie metod w klasie
		for (Method method : clazz.getMethods()) {
			System.out.println(method.getName());
		}
	}

	public static void testException() {
		Warrior testWarrior = new Warrior();
		try {
			testWarrior.setName("A");
		} catch (ToShortWarriorNameException e) { // tu mozna uzyc RuntimeException lub Exception
			System.out.println("Your warrior name is too short.");
		} finally {
			System.out.println(testWarrior.getName());
		}

	}
}
