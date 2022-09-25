package com.eclipse.ec.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eclipse.ec.repository.EnemyEntity;
import com.eclipse.ec.repository.EnemyRepository;

@RestController
public class EnemyController {

	private EnemyRepository enemyRepository;

	public EnemyController(EnemyRepository enemyRepository) {
		this.enemyRepository = enemyRepository;
	}

	@RequestMapping(value = "/game/enemies", method = RequestMethod.GET)
	public ResponseEntity<List<EnemyEntity>> getAllEnemies() {
		List<EnemyEntity> enemies = new ArrayList<>();
		for (EnemyEntity enemy : enemyRepository.findAll()) {
			enemies.add(enemy);
		}
		return new ResponseEntity<List<EnemyEntity>>(enemies, HttpStatus.OK);
	}
}
