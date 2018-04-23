package com.otavio.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.otavio.cursomc.dominio.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
