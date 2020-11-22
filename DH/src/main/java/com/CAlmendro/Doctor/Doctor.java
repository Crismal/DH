package com.CAlmendro.Doctor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDoctor;

	@Column
	private String nombre;

	@Column
	private String apellido;

	@Column
	private String fechaNacimiento;

	@Column
	private String direccion;

	@Column
	private String fotoPerfil;

	@Column
	private String estadoRegistro;

	@Column
	private String fechaRegistro;

	@Column
	private String fechaModificacion;

	@Column
	private Long HospitalIdHospital;

	public Long getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Long IdDoctor) {
		this.idDoctor = IdDoctor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public String getEstadoRegistro() {
		return estadoRegistro;
	}

	public void setEstadoRegistro(String estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Long getIdHospital() {
		return HospitalIdHospital;
	}

	public void setIdHospital(Long idHospital) {
		this.HospitalIdHospital = idHospital;
	}

}