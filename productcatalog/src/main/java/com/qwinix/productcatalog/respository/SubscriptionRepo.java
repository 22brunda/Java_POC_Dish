package com.qwinix.productcatalog.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qwinix.productcatalog.model.Subscription;

@Repository("subscriptionRepo")
public interface SubscriptionRepo extends JpaRepository<Subscription, Integer> {
	
}