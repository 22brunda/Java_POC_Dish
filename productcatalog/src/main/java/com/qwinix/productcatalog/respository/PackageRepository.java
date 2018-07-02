package com.qwinix.productcatalog.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qwinix.productcatalog.model.PackageBean;

@Repository("packageRepository")
public interface PackageRepository extends JpaRepository<PackageBean, Integer>{
	PackageBean findById(int packageId);

}
