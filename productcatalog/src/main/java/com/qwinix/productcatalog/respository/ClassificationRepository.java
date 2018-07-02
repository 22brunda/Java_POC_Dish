package com.qwinix.productcatalog.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qwinix.productcatalog.model.ClassificationBean;

@Repository("classificationRepository")
public interface ClassificationRepository extends JpaRepository<ClassificationBean, Integer>{
	ClassificationBean findById(int classificationId);

}

