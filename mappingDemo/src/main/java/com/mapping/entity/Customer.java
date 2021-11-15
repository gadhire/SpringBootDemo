package com.mapping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/* @ customer entity
 * @author Nalanda
 * @version 1.o
 * @date 13/11/21
 * 
 * */

@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	
	@Column
	private String name;
	
	@Column
	private String address;
	
	@Column
	private int contact;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Enquiry> enquiry;

	public List<Enquiry> getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(List<Enquiry> enquiry) {
		this.enquiry = enquiry;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Enquiry [cid=" + cid + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}

}
