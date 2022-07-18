package com.movitec.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movitec.app.entity.Equipo;

@Repository
public interface EquipoRepository extends CrudRepository<Equipo, Integer>{

}
