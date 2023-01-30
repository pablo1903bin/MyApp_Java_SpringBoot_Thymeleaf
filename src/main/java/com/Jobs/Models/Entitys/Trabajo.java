package com.Jobs.Models.Entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VACANTES")
public class Trabajo implements Serializable {

	@Id // este es la llave de mi tabla--> pk
	@Column(name = "ID", columnDefinition = "NUMBER") // MAPEA MI TABLA MEDICE LA ESTRC DE MI	// TABLA@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String vacante;
	private double sueldo;
	private String descripcion;
	private String disponible;
	private String fecha;

	public Trabajo() {
	}

	public Trabajo(Integer id, String vacante, double sueldo, String descripcion, String disponible, String fecha) {
		this.id = id;
		this.vacante = vacante;
		this.sueldo = sueldo;
		this.descripcion = descripcion;
		this.disponible = disponible;
		this.fecha = fecha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVacante() {
		return vacante;
	}

	public void setVacante(String vacante) {
		this.vacante = vacante;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Trabajo [id=" + id + ", vacante=" + vacante + ", sueldo=" + sueldo + ", descripcion=" + descripcion
				+ ", disponible=" + disponible + ", fecha=" + fecha + "]";
	}

	private static final long serialVersionUID = 1L;

}
