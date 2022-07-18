package com.movitec.app.security.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.movitec.app.entity.TipoDocumento;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 100)
	private String nombre;
	
	@Column(nullable = false, length = 100)
	private String apellidos;
	
	@Column(nullable = false, length = 9)
	private String telefono;

	@Column(nullable = false, length = 100)
	private String direccion;

	@ManyToOne
	@JoinColumn(name = "tipo_documento_id")
	private TipoDocumento tipoDocumento;
	
	@Column(nullable = false, length = 15)
	private String documento;

	@Column(nullable = false, name = "correo", length = 100)
	private String email;

	@Column(nullable = false)
	private Boolean estado;

	@Column(nullable = false, unique = true, length = 100)
	private String nombreUsuario;

	@Column(nullable = false, unique = true, length = 100, name = "contraseña")
	private String password;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"))
	private Set<Rol> roles = new HashSet<>();

	public Usuario() {
	}

	public Usuario(String nombre, String apellidos, String telefono, String direccion, TipoDocumento tipoDocumento, String documento, String email,
			Boolean estado, String nombreUsuario, String password) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.email = email;
		this.estado = estado;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
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

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
}
