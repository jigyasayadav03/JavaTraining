package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

//entitiyy class
@Entity
public class User
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  id ;
private String name;
private String address;
private String contact;
public User(int id, String name, String address, String contact) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.contact = contact;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
}

}
