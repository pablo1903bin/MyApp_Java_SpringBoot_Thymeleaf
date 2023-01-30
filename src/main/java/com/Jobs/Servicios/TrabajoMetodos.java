package com.Jobs.Servicios;

import java.util.List;

import com.Jobs.Models.Entitys.Empleo;

public interface TrabajoMetodos {
	public List<Empleo> lista();//Con este metodo DE TIPOArray- list me almacenara y traera todos los objetos
	public void guardar(Empleo empleo); //Este metodo es un procedimiento nadamas lo que ara es guardar mi objeto 
}
