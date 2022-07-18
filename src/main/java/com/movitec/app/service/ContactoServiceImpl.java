package com.movitec.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movitec.app.entity.Contacto;
import com.movitec.app.repository.ContactoRepository;

@Service
public class ContactoServiceImpl implements ContactoService{

	@Autowired
	ContactoRepository contactoRepository;
	
	@Override
	@Transactional
	public Contacto save(Contacto contacto) {
		return contactoRepository.save(contacto);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Contacto> findById(Integer id) {
		return contactoRepository.findById(id);
	}
}
