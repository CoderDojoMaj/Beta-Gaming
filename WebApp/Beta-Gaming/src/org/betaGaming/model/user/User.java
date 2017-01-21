package org.betaGaming.model.user;

import java.util.Date;

public class User {
	
	private int ID;
	private String nickname;
	private String passwordHash;
	private String nombre;
	private String apellidos;
	private int reputacion;
	private Date fechaRegistro;
	private Date fechaNacimiento;
	private String usuarioSkype;
	
	public User(int iD, String nickname, String passwordHash, String nombre, String apellidos, int reputacion,
			long fechaRegistro, long fechaNacimiento, String usuarioSkype) {
		super();
		ID = iD;
		this.nickname = nickname;
		this.passwordHash = passwordHash;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.reputacion = reputacion;
		this.fechaRegistro = new Date(fechaRegistro);
		this.fechaNacimiento = new Date(fechaNacimiento);
		this.usuarioSkype = usuarioSkype;
	}
	
	public User(int iD, String nickname, String passwordHash, String nombre, String apellidos, int reputacion,
			Date fechaRegistro, Date fechaNacimiento, String usuarioSkype) {
		super();
		ID = iD;
		this.nickname = nickname;
		this.passwordHash = passwordHash;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.reputacion = reputacion;
		this.fechaRegistro = fechaRegistro;
		this.fechaNacimiento = fechaNacimiento;
		this.usuarioSkype = usuarioSkype;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
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

	public int getReputacion() {
		return reputacion;
	}

	public void setReputacion(int reputacion) {
		this.reputacion = reputacion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(long fechaNacimiento) {
		this.fechaNacimiento = new Date(fechaNacimiento);
	}
	
	@Deprecated
	public void setFechaNacimiento(int year, int month, int day) {
		this.fechaNacimiento = new Date(year, month, day);
	}

	public String getUsuarioSkype() {
		return usuarioSkype;
	}

	public void setUsuarioSkype(String usuarioSkype) {
		this.usuarioSkype = usuarioSkype;
	}

	public int getID() {
		return ID;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
}
