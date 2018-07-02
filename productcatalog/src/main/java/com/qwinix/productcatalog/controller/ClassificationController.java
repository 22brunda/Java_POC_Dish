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

import com.qwinix.productcatalog.model.ClassificationBean;
import com.qwinix.productcatalog.service.ClassificationService;

@RestController
@EnableAutoConfiguration
public class ClassificationController {
	@Autowired
	ClassificationService classificationService;

	@GetMapping("/classifications")
	public List<ClassificationBean> getAllClassifiaction() {
		return  classificationService.getAllClassification();
	}

	@GetMapping("/classification/{id}")
	public ClassificationBean getClassificationById(@PathVariable(value = "id") int classificationId) {
		return classificationService.findById(classificationId);
	}

	@PostMapping("/classification")
	public void createClassification(@RequestBody ClassificationBean classification) {
		classificationService.createClassification(classification);
	}

	@PutMapping("/classification/{id}")
	public void updateClassification(@RequestBody ClassificationBean classificationUpdate) {
		classificationService.updateClassification(classificationUpdate);
	}
	@DeleteMapping("/classification/{id}")
	public void deleteClassificationById(@PathVariable(value = "id") int deleteClassificationId) {
		classificationService.deleteById(deleteClassificationId);
	}
}