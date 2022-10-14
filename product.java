package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "general_product")
public class product {	
	
	
	@Id
	@Column(name = "p_id")
	private int id;
	private String b_name;
	private String p_name;
	private int p_price;
	private int qty;
	
	public product() {
		
	}
	
	
	public product(int id, String b_name, String p_name, int p_price, int qty) {
		
		this.id = id;
		this.b_name = b_name;
		this.p_name = p_name;
		this.p_price = p_price;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", b_name=" + b_name + ", p_name=" + p_name + ", p_price=" + p_price + ", qty="
				+ qty + "]";
	}
	
	
	

}
