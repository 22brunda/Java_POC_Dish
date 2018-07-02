package com.qwinix.productcatalog.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qwinix.productcatalog.model.PlanBean;

@Repository("planRepository")
public interface PlanRepository extends JpaRepository<PlanBean, Integer>{
	PlanBean findById(int planId);
}
