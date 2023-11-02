package com.mapping.oneTOmany;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "Student_Table")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "student_Id")
	private int studentID;
	private String Name;
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	@JsonManagedReference
private List<Address> address;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String studentName) {
		this.Name = studentName;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + Name + ", address=" + address + "]";
	}
	public Student(int studentID, String Name, List<Address> address) {
		super();
		this.studentID = studentID;
		this.Name = Name;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		}
