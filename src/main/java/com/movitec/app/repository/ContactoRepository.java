package com.movitec.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movitec.app.entity.Contacto;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Integer>{

}
