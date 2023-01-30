package com.Jobs.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jobs.Dao.EmpleoDao;
import com.Jobs.Models.Entitys.Empleo;

@Service//Este es mi servicio que ara el trabajo de persistencia
public class ImpMetEmpl implements MetodosEmpleo{

	@Autowired
	EmpleoDao empleoDao;
	
	@Override
	public List<Empleo> lista() {
		return  (List<Empleo>) empleoDao.findAll();
	}

	@Override
	public void guardar(Empleo empleo) {
		empleoDao.save(empleo);
	}
}
