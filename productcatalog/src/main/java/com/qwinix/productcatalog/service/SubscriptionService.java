package com.qwinix.productcatalog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwinix.productcatalog.model.Subscription;
import com.qwinix.productcatalog.respository.SubscriptionRepo;

@Service
public class SubscriptionService {
	@Autowired
	SubscriptionRepo subscriptionRepo;

	public Subscription createSubscription(Subscription subscribe) {
		Subscription subscriber = subscriptionRepo.save(subscribe);
		return subscriber;
	}
	
	public Subscription findSubscription(Subscription subscribe) {
		Optional<Subscription> subscriber = subscriptionRepo.findById(subscribe.getSubscription_id());
		return subscriber.get();
	}
	
	public void deleteSubscription(Subscription subscribe) {
		subscriptionRepo.delete(subscribe);
	}
}