package com.qwinix.productcatalog.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;

@Entity
//@DynamicUpdate
@Table(name = "package")
public class PackageBean {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	
	@OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Channel> channels = new ArrayList<>();
	
	@NotNull
	@Size(min=2, max=30, message="Name should have atleast 2 characters")
	@Column(name = "name") private String name;
	@NotNull
	@Size(max=255, message="Description must be 255 characters")
	@Column(name = "description") private String description;
	@Digits(integer=10, fraction=2, message="Amount must be 10 integer and 2 fraction")
	@Column(name = "amount") private float amount;
//	@NotNull
//	@Size(max=4)
	@Column(name = "priority") private int priority;
	@AssertTrue(message = "By Default channel should be active")
	@Column(name = "enabled") private Boolean enabled;

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
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
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
	public List<Channel> getChannels() {
		return channels;
	}
	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}


}