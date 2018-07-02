package com.qwinix.productcatalog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwinix.productcatalog.model.PackageBean;
import com.qwinix.productcatalog.respository.PackageRepository;

@Service
public class PackageService {
	@Autowired
	PackageRepository packageRepository;

	public PackageBean createPackage(PackageBean apackage) {
		PackageBean addPackage = packageRepository.save(apackage);
		return addPackage;
	}

	public java.util.List<PackageBean> getAllPackageBean() {
		List<PackageBean> packages = new ArrayList<>();
		packages = packageRepository.findAll();
		return packages;
	}

	public PackageBean findById(int packageId) {
		return packageRepository.findById(packageId);
	}

	public PackageBean updatePackage(PackageBean packageUpdate) {
		PackageBean updatedPackage = packageRepository.save(packageUpdate);
		return updatedPackage;
		
	}

	public void deleteById(int deletePackageId) {
		packageRepository.deleteById(deletePackageId);
		
	}

	
}
