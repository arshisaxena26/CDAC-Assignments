package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer userId;

	@Column(length = 25, unique = true)
	private String email;

	@Column(length = 25)
	private String name;

	@Column(length = 10)
	private String password;

	// One To Many Bidirectional Mapping
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	List<Passenger> passengers = new ArrayList<>();

	public User() {
		System.out.println("In User Pojo's Default Constructor");
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", name=" + name + ", password=" + password + "]";
	}

	/*
	 * // Helper Methods
	 * 
	 * public void addPassengerToList(Passenger p) { passengers.add(p);
	 * p.setUser(this); }
	 * 
	 * public void removePassengerFromList(Passenger p) { passengers.remove(p);
	 * p.setUser(null); }
	 */
}
