package com.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Electronics")
public class Electronics {

	@Id
	private int e_id;
	
	private String e_name;
	
	private int price;
	
	
	
	@OneToMany(fetch = FetchType.LAZY,targetEntity = product.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "elecroinics_id",referencedColumnName = "e_id")
	private Set additems;
	
	public Electronics() {
		
	}

	public Electronics(int e_id, String e_name, int price, Set additems) {
		
		this.e_id = e_id;
		this.e_name = e_name;
		this.price = price;
		this.additems = additems;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Set getAdditems() {
		return additems;
	}

	public void setAdditems(Set additems) {
		this.additems = additems;
	}

	@Override
	public String toString() {
		return "Electronics "+this.getAdditems();
	}

	
	
	
	
	
	
	

}
