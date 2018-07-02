package com.qwinix.productcatalog.respository;

import com.qwinix.productcatalog.model.PackageBean;

public interface PackageRepositoryImp {
	PackageBean readChannel(int id);
	PackageBean createChannel(int id);
	PackageBean updateChannel(int id);
	PackageBean deleteChannel(int id);
}
