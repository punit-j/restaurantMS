package com.cts.foodster.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Staff {

	@Id
	private String staffId;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String address;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + "]";
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
