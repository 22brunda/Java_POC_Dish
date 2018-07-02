package com.qwinix.productcatalog.respository;

import com.qwinix.productcatalog.model.PlanBean;

public interface PlanRepoImpl {
	PlanBean readPlan(int id);
	PlanBean createPlan(int id);
	PlanBean updatePlan(int id);
	PlanBean deletePlan(int id);
}
