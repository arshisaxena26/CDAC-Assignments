package com.app.pojos;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "flights")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer flightId;

	@NotNull(message = "Airline cannot be Null")
	@Column(length = 30)
	private String airline;

	@NotNull(message = "Departure City cannot be Null")
	@Enumerated(EnumType.STRING)
	@Column(length = 20, name = "dep_city")
	private City departureCity;

	@NotNull(message = "Arrival City cannot be Null")
	@Enumerated(EnumType.STRING)
	@Column(length = 20, name = "arrival_city")
	private City arrivalCity;

	@NotNull(message = "Departure Time cannot be Null")
	@Column(name = "time")
	private LocalTime departureTime;

	public Flight() {
		// Default Constructor
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public City getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(City departureCity) {
		this.departureCity = departureCity;
	}

	public City getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(City arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airline=" + airline + ", departureCity=" + departureCity
				+ ", ArrivalCity=" + arrivalCity + ", departureTime=" + departureTime + "]";
	}
}
