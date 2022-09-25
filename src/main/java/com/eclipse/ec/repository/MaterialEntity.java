package com.eclipse.ec.repository;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "material")
@Entity
public class MaterialEntity {

	@Id
	private Integer id;
	private String name;
	@Column(name = "intiative")
	private Integer initiative;

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

	public MaterialEntity() {
		super();
	}

	public MaterialEntity(Integer id, String name, Integer initiative) {
		super();
		this.id = id;
		this.name = name;
		this.initiative = initiative;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, initiative, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaterialEntity other = (MaterialEntity) obj;
		return Objects.equals(id, other.id) && Objects.equals(initiative, other.initiative)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Material [id=" + id + ", name=" + name + ", initiative=" + initiative + "]";
	}

}
