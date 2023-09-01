package com.Project.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Transation")
public class Transaction {
	@Id
	@GeneratedValue
	private int transaction_id;
	private int buyer_id;
	private int product_id;
	private Long transaction_amount;
	

	public Transaction() {
		super();
	}
	public Transaction(int transaction_id, int buyer_id, int product_id, Long transaction_amount) {
		super();
		this.transaction_id = transaction_id;
		this.buyer_id = buyer_id;
		this.product_id = product_id;
		this.transaction_amount = transaction_amount;
	}
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public Long getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(Long transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	
	

}
