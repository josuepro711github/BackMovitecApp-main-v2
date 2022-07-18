package com.movitec.app.security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movitec.app.security.entity.Usuario;
import com.movitec.app.security.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Transactional(readOnly = true)
	public Optional<Usuario> getById(Integer id){
		return usuarioRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
		return usuarioRepository.findByNombreUsuario(nombreUsuario);
	}
	
	@Transactional(readOnly = true)
	public boolean existsByNombreUsuario(String nombreUsuario) {
		return usuarioRepository.existsByNombreUsuario(nombreUsuario);
	}

	@Transactional(readOnly = true)
	public boolean existsByEmail(String email) {
		return usuarioRepository.existsByEmail(email);
	}

	@Transactional
	public void save(Usuario usuario){
		usuarioRepository.save(usuario);
	}
	
	@Transactional(readOnly = true)
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	
	@Transactional
	public void deleteById(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	@Transactional(readOnly = true)
	public List<Usuario> findActivos(){
		return usuarioRepository.findByEstado(true);
	}
}
