package com.qwinix.productcatalog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qwinix.productcatalog.model.PlanBean;
import com.qwinix.productcatalog.respository.PlanRepository;

public class PlanService {
	@Autowired
	PlanRepository planRepository;

	public java.util.List<PlanBean> getAllPlans() {
		List<PlanBean> plans = new ArrayList<>();
		//channelRepository.findAll().forEach(channels::add);
		plans = planRepository.findAll();
		return plans;
	}

	public PlanBean findById(int planId) {
		return planRepository.findById(planId);
	}

	public PlanBean createPlan(PlanBean plans) {
		PlanBean addPlans = planRepository.save(plans);
		return addPlans;
	}

	public PlanBean planUpdate(PlanBean planUpdate) {
		PlanBean updatedPlan = planRepository.save(planUpdate);
		return updatedPlan;
	}

	public void deleteById(int deletePlanlId) {
		planRepository.deleteById(deletePlanlId);
	}
}
