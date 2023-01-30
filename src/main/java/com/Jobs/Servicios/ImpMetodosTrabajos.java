package com.Jobs.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jobs.Dao.EmpleoDao;
import com.Jobs.Dao.vacanteDAO;
import com.Jobs.Models.Entitys.Empleo;
import com.Jobs.Models.Entitys.Trabajo;

@Service
public class ImpMetodosTrabajos implements TrabajoMetodos {

@Autowired
EmpleoDao empleoDao;

	@Override
	public void guardar(Empleo empleo) {
				
	}

	@Override
	public List<Empleo> lista() {
		
		return null;
	}
}
