package com.eclipse.ec.repository;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "enemy_type")
@Entity
public class EnemyTypeEntity {

	@Id
	private Integer id;
	private String name;
	@JoinColumn(name = "origin_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private OriginEntity origin;

	public EnemyTypeEntity(Integer id, String name, OriginEntity origin) {
		super();
		this.id = id;
		this.name = name;
		this.origin = origin;
	}

	public EnemyTypeEntity() {
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

	public OriginEntity getOrigin() {
		return origin;
	}

	public void setOrigin(OriginEntity origin) {
		this.origin = origin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, origin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnemyTypeEntity other = (EnemyTypeEntity) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(origin, other.origin);
	}

	@Override
	public String toString() {
		return "EnemyTypeEntity [id=" + id + ", name=" + name + ", origin=" + origin + "]";
	}

}
