package com.movitec.app.security.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class JwtDto {
	private String token;
	private String bearer = "Bearer";
	private String nombreUsuario;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	private Boolean estado;
	
	private Collection<? extends GrantedAuthority> authorities;
	
	public JwtDto(String token, String nombreUsuario, String nombre, String apellidos, String telefono,
			String direccion, Boolean estado, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.token = token;
		this.nombreUsuario = nombreUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.estado = estado;
		this.authorities = authorities;
	}

	// getter and setter
	public String getToken() {
		return token;
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
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getBearer() {
		return bearer;
	}
	public void setBearer(String bearer) {
		this.bearer = bearer;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}
}