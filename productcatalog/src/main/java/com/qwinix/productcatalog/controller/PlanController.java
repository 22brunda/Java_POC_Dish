package com.qwinix.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qwinix.productcatalog.model.PlanBean;
import com.qwinix.productcatalog.service.PlanService;

@RestController
@EnableAutoConfiguration
public class PlanController {
	@Autowired
	PlanService planService;

	@GetMapping("/plans")
	public List<PlanBean> getAllPlans() {
		return  planService.getAllPlans();
	}

	@GetMapping("/plan/{id}")
	public PlanBean getPlanById(@PathVariable(value = "id") int planId) {
		return planService.findById(planId);
	}

	@PostMapping("/plan")
	public void createPlan(@RequestBody PlanBean plans) {
		planService.createPlan(plans);
	}

	@PutMapping("/plan/{id}")
	public void updatePlan(@RequestBody PlanBean planUpdate) {
		planService.planUpdate(planUpdate);
	}
	
	@DeleteMapping("/plan/{id}")
	public void deletePlanById(@PathVariable(value = "id") int deletePlanId) {
		planService.deleteById(deletePlanId);
	}
}