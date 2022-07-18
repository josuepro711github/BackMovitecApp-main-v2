package com.movitec.app.security.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.movitec.app.security.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findByNombreUsuario(String nombreUsuario);
	boolean existsByNombreUsuario(String nombreUsuario);
	boolean existsByEmail(String email);
	public List<Usuario> findByEstado(boolean estado);
}
