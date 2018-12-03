package com.rest.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.rest.model.Library;

@Entity
@Table
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="category_seq")
	@SequenceGenerator (name="category_seq",sequenceName="cat_seq")
	private long categoryId;
	
	@Column
	private String categoryName;
	
	@Column
	private String categoryDesc;
	
	@JsonIgnoreProperties("category")
	@OneToMany(mappedBy="category", orphanRemoval = true, cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Library> library;
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDesc="
				+ categoryDesc + "]";
	}
}
