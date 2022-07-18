package com.movitec.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movitec.app.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{
	
}
