package com.movitec.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movitec.app.entity.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer>{

}
