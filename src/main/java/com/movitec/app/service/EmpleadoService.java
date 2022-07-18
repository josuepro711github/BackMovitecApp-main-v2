package com.movitec.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movitec.app.entity.Empleado;
import com.movitec.app.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Transactional(readOnly = true)
	public Iterable<Empleado> findAll(){
		return empleadoRepository.findAll();
	}
}
