package com.movitec.app.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movitec.app.security.entity.Rol;
import com.movitec.app.security.enums.RolNombre;
import com.movitec.app.security.repository.RolRepository;

@Service
public class RolService {
	@Autowired
	RolRepository rolRepository;
	
	@Transactional(readOnly = true)
	public Optional<Rol> getByRolNombre(RolNombre rolNombre){
		return rolRepository.findByRolNombre(rolNombre);
	}
}
