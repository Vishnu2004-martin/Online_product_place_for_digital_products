package com.Project.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	@Id
	@GeneratedValue
	private int products_id;
	private int seller_id;
	private String products_name;
	private String descrition;
	private Long price;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fktransactionid")
	public Transaction transaction;

	public int getProducts_id() {
		return products_id;
	}

	public void setProducts_id(int products_id) {
		this.products_id = products_id;
	}

	public int getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}

	public String getProducts_name() {
		return products_name;
	}

	public void setProducts_name(String products_name) {
		this.products_name = products_name;
	}

	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Products(int products_id, int seller_id, String products_name, String descrition, Long price,
			Transaction transaction) {
		super();
		this.products_id = products_id;
		this.seller_id = seller_id;
		this.products_name = products_name;
		this.descrition = descrition;
		this.price = price;
		this.transaction = transaction;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
