package com.movitec.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movitec.app.entity.Contacto;
import com.movitec.app.service.ContactoServiceImpl;

@RestController
@RequestMapping("api/contactos")
public class ContactoController {
	@Autowired
	ContactoServiceImpl contactoService;
	
	@PostMapping
	public ResponseEntity<?> nuevo(@RequestBody Contacto contacto){
		return ResponseEntity.status(HttpStatus.CREATED).body(contactoService.save(contacto));
	}
}
