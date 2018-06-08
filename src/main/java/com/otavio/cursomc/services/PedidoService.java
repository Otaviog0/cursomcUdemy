package com.otavio.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otavio.cursomc.dominio.Pedido;
import com.otavio.cursomc.repositories.PedidoRepository;
import com.otavio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encotrado Id : " + id
					+ ", Tipo: " + Pedido.class.getName());
		}
		return obj;
	}
}
