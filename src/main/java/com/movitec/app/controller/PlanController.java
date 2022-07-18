package com.movitec.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movitec.app.dto.PlanDTORequest;
import com.movitec.app.entity.Plan;
import com.movitec.app.service.PlanService;

@RestController
@RequestMapping("/api/planes")
public class PlanController {
	
	@Autowired
	private PlanService planService;
	
	//@PreAuthorize("hasRole('ADMIN')")
	@GetMapping()
	public List<Plan> traerTodo(){
		return StreamSupport.stream(planService.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}
	
	@PostMapping("/nuevo")
	public ResponseEntity<?> nuevo(@Valid @RequestBody PlanDTORequest nuevoPlan, BindingResult bindingResult){
		
		Map<String, Object> response = new HashMap<>();

		if (bindingResult.hasErrors()) {

			List<String> errors = bindingResult.getFieldErrors().stream()
					.map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
					.collect(Collectors.toList());

			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		Plan plan = new Plan(nuevoPlan.getVelocidadPlan(), nuevoPlan.getPrecioPlan());
		
		try {
			planService.guardarPlan(plan);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("mensaje", "El plan ha sido creado con exito!");
		response.put("plan", plan);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteById(@PathVariable(value = "id") Integer id) {
		try {
			planService.eliminarPlan(id);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	@PutMapping("/editar/{id}")
		public void editar(@PathVariable Integer id, @RequestBody PlanDTORequest nuevoPlan) {
		
			Optional<Plan> plan = planService.findById(id);
			if(plan.isPresent()) {
				Plan p = plan.get();
				p.setPrecio(nuevoPlan.getPrecioPlan());
				p.setVelocidad(nuevoPlan.getVelocidadPlan());
				planService.guardarPlan(p);
				
			}
		}
	
}















