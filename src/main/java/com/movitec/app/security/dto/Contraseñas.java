package com.movitec.app.security.dto;

public class Contraseñas {
	private String nomUsuario;
	private String passAniguo;
	private String passNuevo;
	public Contraseñas(String nomUsuario, String passAniguo, String passNuevo) {
		super();
		this.nomUsuario = nomUsuario;
		this.passAniguo = passAniguo;
		this.passNuevo = passNuevo;
	}
	public String getPassAniguo() {
		return passAniguo;
	}
	public void setPassAniguo(String passAniguo) {
		this.passAniguo = passAniguo;
	}
	public String getPassNuevo() {
		return passNuevo;
	}
	public void setPassNuevo(String passNuevo) {
		this.passNuevo = passNuevo;
	}
	public String getNomUsuario() {
		return nomUsuario;
	}
	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
}
