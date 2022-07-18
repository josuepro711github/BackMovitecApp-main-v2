package com.movitec.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movitec.app.entity.EnviarGmail;
import com.movitec.app.security.entity.Usuario;
import com.movitec.app.security.service.UsuarioService;

@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public boolean enviarCorreo() {
		List<Usuario> lista = usuarioService.findActivos();
		EnviarGmail envio = new EnviarGmail();
		try {
			return envio.enviar(lista);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
