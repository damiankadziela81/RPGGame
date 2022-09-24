package com.eclipse.ec.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eclipse.ec.domain.Forest;
import com.eclipse.ec.enums.Places;
import com.eclipse.ec.enums.Weapons;
import com.eclipse.ec.repository.Warrior;
import com.eclipse.ec.services.ForestServices;

@RestController
public class GameController {
	
	private String gameName;
	private int enemiesNumb;
	
	//w przeglądarce http://localhost:8080/game
	@RequestMapping(value = "/game", method = RequestMethod.GET)
	public String getGameData() {
		return "my game data: " + gameName + " with number of enemies: " + enemiesNumb;
	}
	
	@RequestMapping(value = "/game/fight", method = RequestMethod.GET)
	public String getFight() {
		Warrior warrior = new Warrior();
		try {
			warrior.setName("Web Connan");
			warrior.setVisitedPlace(Places.GRAVEYARD);
			warrior.setWeapon(Weapons.STICK);
			warrior.setHitPoints(10);
			warrior.setInitiative(1);
		} catch (Exception e) {
			System.out.println("Your warrior's name is too short");
		}
		ForestServices forestService = new ForestServices();
		Forest forest = forestService.createForest();
		String fightOutcome = forest.fightOnWeb(warrior);
		
		return fightOutcome;
	}
	
	//w postmanie POST http://localhost:8080/game/myGameName
	@RequestMapping(value = "/game/{name}", method = RequestMethod.POST)
	@ResponseBody
	public String postGameData(@PathVariable("name") String name) {
		this.gameName = name;
		return "my game name: " + name;
	}
	
	//w postmanie PUT http://localhost:8080/game/enemies?numb=34
	@RequestMapping(value = "/game/enemies", method = RequestMethod.PUT)
	@ResponseBody
	public String putGameEnemies(@RequestParam("numb") int enemyNumb) {
		this.enemiesNumb = enemyNumb;
		return "set enemy numb: " + enemyNumb;
	}
	
	

}
