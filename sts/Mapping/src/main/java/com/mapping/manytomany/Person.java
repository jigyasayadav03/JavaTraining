package com.mapping.manytomany;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "person_table")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "person_vehicle", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "vehicle_id"))
	//@JsonManagedReference
	private List<Vehicle> vehicle;

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

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", vehicle=" + vehicle + "]";
	}

	public Person(int id, String name, List<Vehicle> vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.vehicle = vehicle;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
