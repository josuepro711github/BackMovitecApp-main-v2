package com.movitec.app.service;

import java.util.Optional;

import com.movitec.app.entity.Contacto;

public interface ContactoService {
	public Contacto save(Contacto contacto);
	
	public Optional<Contacto> findById(Integer id);
}
