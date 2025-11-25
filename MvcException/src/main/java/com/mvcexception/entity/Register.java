package com.mvcexception.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Register {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String gender;
    private String confirmation;
    private String city;

    @ElementCollection
    private List<String> hobbies;

    private String about;
    private String dob;

    @OneToOne
    private Address address;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", confirmation=" + confirmation + ", city=" + city + ", hobbies=" + hobbies + ", about=" + about
				+ ", dob=" + dob + ", address=" + address + "]";
	}

	public Register(Long id, String firstName, String lastName, String gender, String confirmation, String city,
			List<String> hobbies, String about, String dob, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.confirmation = confirmation;
		this.city = city;
		this.hobbies = hobbies;
		this.about = about;
		this.dob = dob;
		this.address = address;
	}

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

     
}
