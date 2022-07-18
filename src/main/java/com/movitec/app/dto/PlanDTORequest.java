package com.movitec.app.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PlanDTORequest {

	private Integer idPlan;
		
	@NotNull
	@Min(value = 10)
	@Max(value = 1000)
	private Double precioPlan;
	
	@NotNull
	@Min(value = 10)
	@Max(value = 1000)
	private Integer velocidadPlan;
	
	public Integer getIdPlan() {
		return idPlan;
	}

	public void setIdPlan(Integer idPlan) {
		this.idPlan = idPlan;
	}

	public Integer getVelocidadPlan() {
		return velocidadPlan;
	}

	public void setVelocidadPlan(Integer velocidadPlan) {
		this.velocidadPlan = velocidadPlan;
	}

	public Double getPrecioPlan() {
		return precioPlan;
	}

	public void setPrecioPlan(Double precioPlan) {
		this.precioPlan = precioPlan;
	}
	
	
	
}
