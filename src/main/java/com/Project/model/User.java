package com.Project.model;

import java.util.List;

//import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	private int userid;
	@Column(name="name")
	private String name;
	private String email;
	private String password;


@OneToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
@JoinColumn(name="fkcategory_id")
private Categories cate;

@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="userid")
private List<Products>products;

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Categories getCate() {
	return cate;
}

public void setCate(Categories cate) {
	this.cate = cate;
}

public List<Products> getProducts() {
	return products;
}

public void setProducts(List<Products> products) {
	this.products = products;
}

public User(int userid, String name, String email, String password, Categories cate, List<Products> products) {
	super();
	this.userid = userid;
	this.name = name;
	this.email = email;
	this.password = password;
	this.cate = cate;
	this.products = products;
}

public User() {
	super();
}



}
