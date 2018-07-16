package com.qwinix.productcatalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "plan")
public class PlanBean {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@NotNull
	@Size(min=2, max=30, message="Name should have atleast 2 characters")
	@Column(name = "name") private String name;
	@NotNull
	@Size(max=255, message="Description must be 255 characters")
	@Column(name = "description") private String description;
	@NotNull
	@Max(4)
	@Column(name = "priority") private int priority;
	@AssertTrue(message = "By Default channel should be active")
	@Column(name = "enabled") private Boolean enabled;
	@NotNull
	@Max(4)
	@Column(name = "package_id") private int package_id;
	@Digits(integer=10, fraction=2)
	@Column(name = "amount") private float amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public int getPackage_id() {
		return package_id;
	}
	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}