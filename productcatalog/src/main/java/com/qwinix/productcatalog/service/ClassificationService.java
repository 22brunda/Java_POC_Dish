package com.qwinix.productcatalog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwinix.productcatalog.model.ClassificationBean;
import com.qwinix.productcatalog.respository.ClassificationRepository;

@Service
public class ClassificationService {
	@Autowired
	ClassificationRepository classificationRepository;

	public java.util.List<ClassificationBean> getAllClassification() {
		List<ClassificationBean> classification = new ArrayList<>();
		//channelRepository.findAll().forEach(channels::add);
		classification = classificationRepository.findAll();
		return classification;
	}

	public ClassificationBean findById(int classificationId) {
		return classificationRepository.findById(classificationId);
	}

	public ClassificationBean createClassification(ClassificationBean classification) {
		ClassificationBean addClassification = classificationRepository.save(classification);
		return addClassification;
	}

	public ClassificationBean updateClassification(ClassificationBean classificationUpdate) {
		ClassificationBean updatedClassification = classificationRepository.save(classificationUpdate);
		return updatedClassification;
	}

	public void deleteById(int delClassificationId) {
		classificationRepository.deleteById(delClassificationId);
	}
}
