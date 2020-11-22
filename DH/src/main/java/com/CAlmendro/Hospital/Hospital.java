package com.CAlmendro.Hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
 
	@Id
	@Column
	private Long idHospital;
 
	@Column
	private String nombre;
	
	@Column
	private String estadoRegistro;

	@Column
	private String fechaRegistro;

	@Column
	private String fechaModificacion;

	
	public Long getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(Long idHospital) {
		this.idHospital = idHospital;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

}
