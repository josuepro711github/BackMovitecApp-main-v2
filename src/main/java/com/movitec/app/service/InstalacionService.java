package com.movitec.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movitec.app.entity.Instalacion;
import com.movitec.app.repository.InstalacionRepository;

@Service
public class InstalacionService {
	@Autowired
	InstalacionRepository instalacionRepository;
	
	@Transactional(readOnly = true)
	public List<Instalacion> findByClienteId(Integer idCliente){
		return instalacionRepository.findByClienteId(idCliente);
	}
}
