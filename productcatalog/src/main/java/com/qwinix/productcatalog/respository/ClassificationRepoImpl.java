package com.qwinix.productcatalog.respository;

import com.qwinix.productcatalog.model.ClassificationBean;

public interface ClassificationRepoImpl {
	ClassificationBean readClassification(int id);
	ClassificationBean createClassification(int id);
	ClassificationBean updateClassification(int id);
	ClassificationBean deleteClassification(int id);
}
