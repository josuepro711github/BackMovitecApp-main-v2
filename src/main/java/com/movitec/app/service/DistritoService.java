package com.movitec.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movitec.app.entity.Distrito;
import com.movitec.app.repository.DistritoRepository;

@Service
public class DistritoService {
	 @Autowired
	 DistritoRepository distritoRepository;
	 
	 @Transactional(readOnly = true)
	 public List<Distrito> findActivos(){
		 return distritoRepository.findByEstado(true);
	 }
}
