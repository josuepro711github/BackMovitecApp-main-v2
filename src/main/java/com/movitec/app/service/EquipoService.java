package com.movitec.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movitec.app.entity.Equipo;
import com.movitec.app.repository.EquipoRepository;

@Service
public class EquipoService {
	@Autowired
	EquipoRepository equipoRepository;
	
	@Transactional(readOnly = true)
	public Iterable<Equipo> findAll(){
		return equipoRepository.findAll();
	}
}
