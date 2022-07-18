package com.movitec.app.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movitec.app.security.entity.Rol;
import com.movitec.app.security.enums.RolNombre;

public interface RolRepository extends JpaRepository<Rol, Integer>{
	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
