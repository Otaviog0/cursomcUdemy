package com.otavio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.otavio.cursomc.dominio.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
