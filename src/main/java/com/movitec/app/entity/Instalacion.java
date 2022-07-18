package com.movitec.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.movitec.app.security.entity.Usuario;

@Entity
@Table(name = "instalacion")
public class Instalacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "Cliente_id")
	private Usuario cliente;

	@ManyToOne
	@JoinColumn(name = "Equipo_id")
	private Equipo equipo;

	private Date fecha;

	private String serie;
	
	private String direccion;
	
	@ManyToOne
	@JoinColumn(name = "Empleado_id")
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name = "Plan_id")
	private Plan plan;

	public Instalacion() {}
	
	public Instalacion(Integer id, Usuario cliente, Equipo equipo, Date fecha, String serie,String direccion, Empleado empleado,
			Plan plan) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.equipo = equipo;
		this.fecha = fecha;
		this.serie = serie;
		this.direccion = direccion;
		this.empleado = empleado;
		this.plan = plan;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
