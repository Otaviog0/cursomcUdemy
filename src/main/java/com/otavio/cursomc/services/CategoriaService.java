package com.otavio.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otavio.cursomc.dominio.Categoria;
import com.otavio.cursomc.repositories.CategoriaRepository;
import com.otavio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encotrado Id : " + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}
}
