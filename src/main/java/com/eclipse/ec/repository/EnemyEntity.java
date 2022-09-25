package com.eclipse.ec.repository;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "enemy")
@Entity
public class EnemyEntity {

	@Id
	private Integer id;
	private String name;
	@Column(name = "intiative")
	private Integer initiative;
	@Column(name = "hit_points")
	private Integer hitPoints;
	@JoinColumn(name = "enemy_type_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private EnemyTypeEntity enemyType;
	private Integer regeneration;
	@JoinColumn(name = "wapen_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private WeaponEntity weapon;
	@JoinColumn(name = "immunity")
	@ManyToOne(cascade = CascadeType.ALL)
	private MaterialEntity immunity;

	public EnemyEntity(Integer id, String name, Integer initiative, Integer hitPoints, EnemyTypeEntity enemyType,
			Integer regeneration, WeaponEntity weapon, MaterialEntity immunity) {
		super();
		this.id = id;
		this.name = name;
		this.initiative = initiative;
		this.hitPoints = hitPoints;
		this.enemyType = enemyType;
		this.regeneration = regeneration;
		this.weapon = weapon;
		this.immunity = immunity;
	}

	public EnemyEntity() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getInitiative() {
		return initiative;
	}

	public void setInitiative(Integer initiative) {
		this.initiative = initiative;
	}

	public Integer getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(Integer hitPoints) {
		this.hitPoints = hitPoints;
	}

	public EnemyTypeEntity getEnemyType() {
		return enemyType;
	}

	public void setEnemyType(EnemyTypeEntity enemyType) {
		this.enemyType = enemyType;
	}

	public Integer getRegeneration() {
		return regeneration;
	}

	public void setRegeneration(Integer regeneration) {
		this.regeneration = regeneration;
	}

	public WeaponEntity getWeapon() {
		return weapon;
	}

	public void setWeapon(WeaponEntity weapon) {
		this.weapon = weapon;
	}

	public MaterialEntity getMaterial() {
		return immunity;
	}

	public void setMaterial(MaterialEntity material) {
		this.immunity = material;
	}

	@Override
	public int hashCode() {
		return Objects.hash(enemyType, hitPoints, id, initiative, immunity, name, regeneration, weapon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnemyEntity other = (EnemyEntity) obj;
		return Objects.equals(enemyType, other.enemyType) && Objects.equals(hitPoints, other.hitPoints)
				&& Objects.equals(id, other.id) && Objects.equals(initiative, other.initiative)
				&& Objects.equals(immunity, other.immunity) && Objects.equals(name, other.name)
				&& Objects.equals(regeneration, other.regeneration) && Objects.equals(weapon, other.weapon);
	}

	@Override
	public String toString() {
		return "EnemyEntity [id=" + id + ", name=" + name + ", initiative=" + initiative + ", hitPoints=" + hitPoints
				+ ", enemyType=" + enemyType + ", regeneration=" + regeneration + ", weapon=" + weapon + ", material="
				+ immunity + "]";
	}

}
