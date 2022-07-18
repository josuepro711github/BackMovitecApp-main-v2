package com.movitec.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movitec.app.entity.Distrito;

@Repository
public interface DistritoRepository extends CrudRepository<Distrito, Integer>{
	public List<Distrito> findByEstado(boolean estado);
}
