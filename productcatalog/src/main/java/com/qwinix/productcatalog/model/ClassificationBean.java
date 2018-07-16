package com.qwinix.productcatalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "classification")
public class ClassificationBean {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	private int classificationId;

	@ManyToOne
	//	@JoinColumn(name="classificationid", referencedColumnName="classification_id")
	private ClassificationBean classification;

	public ClassificationBean() {

	}

		public ClassificationBean(int classificationId, String name, String description, int priority, boolean enabled) {
			this.classificationId = classificationId;
			this.name = name;
			this.description = description;
			this.priority = priority;
			this.enabled = enabled;
		}

	@NotNull
	@Size(min=2, max=30, message="Name should have atleast 2 characters")
	@Column(name = "name") private String name;
	@NotNull
	@Size(max=255, message="Description must be 255 characters")
	@Column(name = "description") private String description;
	//	@NotNull
	@Column(name = "priority") private int priority;
	@AssertTrue(message = "By Default channel should be active")
	@Column(name = "enabled") private Boolean enabled;

	public int getClassificationId() {
		return classificationId;
	}
	public void setClassificationId(int classificationId) {
		this.classificationId = classificationId;
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
}
