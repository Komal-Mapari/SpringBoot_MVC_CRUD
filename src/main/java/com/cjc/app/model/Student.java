package com.cjc.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "Student_Data")
@DynamicUpdate
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "Student_Rollno")
	private int rollno;
	
	@Column(name = "Student_Name")
	private String name;
	
	@Column(name = "Student_Address")
	private String address;
	
	@Column(name = "Student_Email")
	private String email;
	
	@Column(name = "Student_ContactNo")
	private long contactno;
	
	@Column(name = "Student_Marks")
	private float marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", contactno=" + contactno + ", marks=" + marks + "]";
	}
	
	
}
