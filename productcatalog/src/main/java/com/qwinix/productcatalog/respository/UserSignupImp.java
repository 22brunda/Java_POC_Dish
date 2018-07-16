package com.qwinix.productcatalog.respository;

import com.qwinix.productcatalog.model.UserSignup;

public interface UserSignupImp {
	UserSignup readUserSignup(int id);
	UserSignup createUserSignup(int id);
//	UserSignup updateChannel(int id);
	UserSignup deleteUserSignup(int id);

}
