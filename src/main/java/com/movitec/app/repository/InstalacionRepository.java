package com.movitec.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movitec.app.entity.Instalacion;

@Repository
public interface InstalacionRepository extends CrudRepository<Instalacion, Integer>{
	List<Instalacion> findByClienteId(Integer idCliente);
}
