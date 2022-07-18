package com.movitec.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movitec.app.dto.InstalacionDto;
import com.movitec.app.entity.Instalacion;
import com.movitec.app.service.InstalacionService;

@RestController
@RequestMapping("/api/instalaciones")
public class InstalacionController {
	
	@Autowired
	InstalacionService instalacionService;
	
	@GetMapping("/{idCliente}")
	public List<InstalacionDto> getAllByClienteId(@PathVariable Integer idCliente){
		List<InstalacionDto> lista = new ArrayList<InstalacionDto>();
		
		for ( Instalacion ins : instalacionService.findByClienteId(idCliente)) {
			InstalacionDto i = new InstalacionDto();
			i.setId(ins.getId());
			i.setFecha(ins.getFecha());
			i.setSerie(ins.getSerie());
			i.setDireccion(ins.getDireccion());
			i.setEmpleado(ins.getEmpleado());
			i.setUsuario(ins.getCliente());
			i.setEquipo(ins.getEquipo());
			i.setPlan(ins.getPlan());
			lista.add(i);
		}
		
		return lista;
	}
}
