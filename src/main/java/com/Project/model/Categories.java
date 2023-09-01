package com.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Categories")
public class Categories {
	@Id
	@GeneratedValue
    private int categories_id;
    private String categories_name;
    
    
	public Categories() {
		super();
	}
	public Categories(int categories_id, String categories_name) {
		super();
		this.categories_id = categories_id;
		this.categories_name = categories_name;
	}
	public int getCategories_id() {
		return categories_id;
	}
	public void setCategories_id(int categories_id) {
		this.categories_id = categories_id;
	}
	public String getCategories_name() {
		return categories_name;
	}
	public void setCategories_name(String categories_name) {
		this.categories_name = categories_name;
	}
    
   
}
