package com.movitec.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movitec.app.entity.Distrito;
import com.movitec.app.service.DistritoService;

@RestController
@RequestMapping("/api/distritos")
public class DistritoController {
	@Autowired
	DistritoService distritoService;
	
	@GetMapping
	public List<Distrito> getActivos(){
		return distritoService.findActivos();
	}
}
