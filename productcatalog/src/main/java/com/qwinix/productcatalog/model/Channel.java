package com.qwinix.productcatalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "channel")
public class Channel {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="package_id", referencedColumnName="id")
	private PackageBean packagebean;
	
	@NotNull
	@Size(min=2, max=30, message="Name should have atleast 2 characters")
	@Column(name = "name") private String name;
	@NotNull
	@Size(max=255, message="Description must be 255 characters")
	@Column(name = "description") private String description;
//	@NotNull 
	@Column(name = "priority") private int priority;
	@NotNull
	@Size(max=50, message="Title must be 50 characters")
	@Column(name = "title") private String title;
	@AssertTrue(message = "By Default channel should be active")
	@Column(name = "active") private Boolean active;
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public PackageBean getPackagebean() {
		return packagebean;
	}
	public void setPackagebean(PackageBean packagebean) {
		this.packagebean = packagebean;
	}
	
}
