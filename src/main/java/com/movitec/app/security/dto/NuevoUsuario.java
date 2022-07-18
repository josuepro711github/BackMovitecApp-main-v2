package com.movitec.app.security.dto;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.movitec.app.entity.TipoDocumento;

public class NuevoUsuario {
	private Integer Id;
	
	@NotEmpty
	@Size(min = 3, max = 12)
	private String nombre	;
	
	@NotEmpty
	private String apellidos;
	
	@NotEmpty
	@Pattern(regexp = "^[0-9]{9,15}$", message = "El telefono debe tener de 9 a 15 números")
	private String telefono;
	
	@NotEmpty
	private String direccion;
	
	@NotNull
	private TipoDocumento tipoDocumento;
	
	@NotEmpty
	private String documento;
	
	@Email
	@NotEmpty
	private String email;
	
	@NotNull
	private Boolean estado;
	
	@NotEmpty
	private String nombreUsuario;
	
	@NotEmpty
	private String password;
	
	private Set<String> roles = new HashSet<>();
	
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
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
}
