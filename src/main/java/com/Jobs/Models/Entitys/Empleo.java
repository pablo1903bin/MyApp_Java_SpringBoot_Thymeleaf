package com.Jobs.Models.Entitys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLEO")
public class Empleo implements Serializable{

@Id // este es la llave de mi tabla--> pk
@GeneratedValue(strategy= GenerationType.IDENTITY)//Generacion de id autoincrementable
private int id;
private String nombre;
private String descripcion;
private String categoria;
private String  status;


private String fecha;

private int destacado;
private double salario;
private String detalles;

public Empleo() {
}

public Empleo(int id, String nombre, String descripcion, String categoria, String status, String fecha, int destacado, double salario, String detalles) {
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.categoria = categoria;
	this.status = status;
	this.fecha = fecha;
	this.destacado = destacado;
	this.salario = salario;
	this.detalles = detalles;
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public int getDestacado() {
	return destacado;
}

public void setDestacado(int destacado) {
	this.destacado = destacado;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public String getDetalles() {
	return detalles;
}

public void setDetalles(String detalles) {
	this.detalles = detalles;
}



@Override
public String toString() {
	return "Empleo [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria
			+ ", status=" + status + ", fecha=" + fecha + ", destacado=" + destacado + ", salario=" + salario
			+ ", detalles=" + detalles + "]";
}



private static final long serialVersionUID = 1L;

}
