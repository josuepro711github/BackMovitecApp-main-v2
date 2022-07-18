package com.movitec.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plan")
public class Plan implements Serializable{

	private static final long serialVersionUID = 508130296738633227L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer velocidad;

	private Double precio;
	
	
	public Plan() {
		
	}

	public Plan(Integer velocidad, Double precio) {
		this.velocidad = velocidad;
		this.precio = precio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
