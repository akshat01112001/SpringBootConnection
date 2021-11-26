package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User Details")
public class RegistrationDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String Email;
	@Column
	private String FirstName;
	@Column
	private String LastName;
	@Column
	private String Username;
	@Column
	private String Phone;
	@Column
	private String RegNo;
	@Column
	private String Address;
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
