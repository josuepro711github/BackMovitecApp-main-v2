package com.movitec.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movitec.app.dto.PlanDTORequest;
import com.movitec.app.dto.PlanDTOResponse;
import com.movitec.app.entity.Plan;
import com.movitec.app.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService{

	@Autowired
	private PlanRepository planRepository;
	
	@Transactional(readOnly = true)
	@Override
	public Iterable<Plan> findAll() {
		return planRepository.findAll();
	}

	@Override
	public void guardarPlan(Plan plan) {
		
		planRepository.save(plan);
	}

	@Override
	public void actualizarPlan(PlanDTORequest plan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPlan(Integer id) {
		planRepository.deleteById(id);
		
	}

	@Override
	public PlanDTOResponse obtenerPlanId(Integer id) {
		Plan plan = planRepository.findById(id).orElse(null);
		PlanDTOResponse dto = new PlanDTOResponse();
		
		dto.setIdPlan(plan.getId());
		dto.setPrecioPlan(plan.getPrecio());
		dto.setVelocidadPlan(plan.getVelocidad());
		
		return dto;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Plan> findById(Integer id) {
		return planRepository.findById(id);
	}
}












