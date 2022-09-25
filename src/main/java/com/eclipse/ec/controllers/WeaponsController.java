package com.eclipse.ec.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eclipse.ec.repository.WeaponEntity;
import com.eclipse.ec.repository.WeaponRepository;

@RestController
public class WeaponsController {

	private WeaponRepository weaponRepository;

	public WeaponsController(WeaponRepository weaponRepository) {
		this.weaponRepository = weaponRepository;
	}

	@RequestMapping(value = "/game/weapons", method = RequestMethod.GET)
	public ResponseEntity<List<WeaponEntity>> getAllWeapons() {
		List<WeaponEntity> weapons = new ArrayList<>();
		for (WeaponEntity weapon : weaponRepository.findAll()) {
			weapons.add(weapon);
		}
		return new ResponseEntity<List<WeaponEntity>>(weapons, HttpStatus.OK);
	}
}
