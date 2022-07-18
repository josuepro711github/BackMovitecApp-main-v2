package com.movitec.app.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.movitec.app.security.enums.RolNombre;

@Entity
@Table(name = "rol")
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private RolNombre rolNombre;
	
	public Rol() {}

	public Rol(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RolNombre getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}
	
	
}
