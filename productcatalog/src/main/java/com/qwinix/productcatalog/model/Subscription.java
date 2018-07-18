package com.qwinix.productcatalog.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
//@DynamicUpdate
@Table(name = "subscriptions")

public class Subscription{	
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
	private int subscription_id; 
    private int user_id;
	
    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(
        name="sub_package",
        joinColumns = @JoinColumn( name="subscription_id"),
        inverseJoinColumns = @JoinColumn( name="id"))
	private List<PackageBean> packagebean;
	
//    @ManyToMany(mappedBy = "subscription_id",fetch = FetchType.EAGER) 
//    private List<PackageBean> packagebean;
    
	public int getSubscription_id() {
		return subscription_id;
	}
	public void setSubscription_id(int subscription_id) {
		this.subscription_id = subscription_id;
	}
	public List<PackageBean> getPackagebean() {
		return packagebean;
	}
	public void setPackagebean(List<PackageBean> packagebean) {
		this.packagebean = packagebean;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}