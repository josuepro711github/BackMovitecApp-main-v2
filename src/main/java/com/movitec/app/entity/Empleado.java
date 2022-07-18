package com.movitec.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table( name = "empleado")
@Entity
public class Empleado{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	
	private String apellidos;
	
	private String telefono;
	
	private String direccion;
	
	private String correo;
	
	private String codigo;
	
	public Empleado() {}

	public Empleado(Integer id, String nombre, String apellidos, String telefono, String direccion, String correo,
			String codigo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.codigo = codigo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
