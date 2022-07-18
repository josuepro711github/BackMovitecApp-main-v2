package com.movitec.app.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movitec.app.entity.Empleado;
import com.movitec.app.service.EmpleadoService;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
	
	@Autowired
	EmpleadoService empleadoService;
	
	@GetMapping
	public List<Empleado> getAll() {
		return StreamSupport.stream(empleadoService.findAll().spliterator(), false).collect(Collectors.toList());
	}
}
