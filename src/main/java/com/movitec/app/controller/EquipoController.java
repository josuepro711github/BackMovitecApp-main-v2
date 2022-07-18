package com.movitec.app.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movitec.app.entity.Equipo;
import com.movitec.app.service.EquipoService;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {
	@Autowired
	EquipoService equipoService;
	
	@GetMapping
	public List<Equipo> getAll(){
		return StreamSupport.stream(equipoService.findAll().spliterator(), false).collect(Collectors.toList());
	}
}
