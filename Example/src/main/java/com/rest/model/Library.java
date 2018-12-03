package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Library {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="library_seq")
	@SequenceGenerator (name="library_seq",sequenceName="Lib_seq")
	private long id;
	
	@Column
    private String content;
	
	@Column
    private String name;
	
	@JsonIgnoreProperties("library")
	@ManyToOne(optional = false)
	@JoinColumn(name = "categoryId")
	Category category;

	public Library() {
		super();
	}

	public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", content=" + content + ", name=" + name + ", category=" + category + "]";
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
