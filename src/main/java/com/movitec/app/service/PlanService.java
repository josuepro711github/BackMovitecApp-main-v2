package com.movitec.app.service;

import java.util.Optional;

import com.movitec.app.dto.PlanDTORequest;
import com.movitec.app.dto.PlanDTOResponse;
import com.movitec.app.entity.Plan;

public interface PlanService {
	
	public Iterable<Plan> findAll();
	void guardarPlan(Plan plan);
	void actualizarPlan(PlanDTORequest plan);
	void eliminarPlan(Integer id);
	PlanDTOResponse obtenerPlanId(Integer id);
	public Optional<Plan> findById(Integer id);
}
