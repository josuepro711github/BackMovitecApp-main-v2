package com.movitec.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movitec.app.dto.UsuarioListDto;
import com.movitec.app.security.entity.Usuario;
import com.movitec.app.security.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	
	@GetMapping
	public List<UsuarioListDto> getAll(){
		List<Usuario> lista = service.findAll();
		List<UsuarioListDto> listareturn = new ArrayList<UsuarioListDto>();
		for(int i = 1; i < lista.size(); i++) {
			UsuarioListDto usuario = new UsuarioListDto();
			usuario.setId(lista.get(i).getId());
			usuario.setApellidos(lista.get(i).getApellidos());
			usuario.setCorreo(lista.get(i).getEmail());
			usuario.setDireccion(lista.get(i).getDireccion());
			usuario.setDocumento(lista.get(i).getDocumento());
			usuario.setEstado(lista.get(i).getEstado());
			usuario.setId(lista.get(i).getId());
			usuario.setNombre(lista.get(i).getNombre());
			usuario.setNombre_Usuario(lista.get(i).getNombreUsuario());
			usuario.setTelefono(lista.get(i).getTelefono());
			usuario.setTipo(lista.get(i).getTipoDocumento().getTipo());
			listareturn.add(usuario);
		}
		return listareturn;
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteById(@PathVariable(value = "id") Integer id) {
		try {
			service.deleteById(id);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
