package com.qwinix.productcatalog.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qwinix.productcatalog.model.UserSignup;

@Repository("userSignupRepository")
public interface UserSignupRepo extends JpaRepository<UserSignup, Integer>{
	UserSignup findByEmail(String email);
}
