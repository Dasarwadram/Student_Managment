package com.student.managment.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long id;
	
	@Column(name="fristName")
 private String firstName;
	
	@Column(name="lastName")
 private String lastName;
	
	@Column(name="email")
 private String email;
	
	@Column(name="mobileNumber")
 private Long mobileNumber;
 
 
 public Student() {
	// TODO Auto-generated constructor stub
}
 
public Student(Long id, String firstName, String lastName, String email, Long mobileNumber) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.mobileNumber = mobileNumber;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(Long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
 
 }
