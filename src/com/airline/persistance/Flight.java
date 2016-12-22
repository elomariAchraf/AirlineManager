package com.airline.persistance;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Flight
 *
 */
@NamedQuery(name="flight.findById", query="SELECT f FROM Flight f WHERE f.id = :id")
@Entity

public class Flight implements Serializable {
	@Transient
	private static final long serialVersionUID = 1L;

	public Flight() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Enumerated(EnumType.STRING)
	private FlightDestination flightOrgin;
	@Enumerated(EnumType.STRING)
	private FlightDestination flightDestination;

	private int price;
	@Temporal(TemporalType.TIMESTAMP)
	private Date flightTime;
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "airplane_fk")
	private Airplan airplaneDetail;
	@OneToMany(mappedBy = "flightPilot")
	private List<Pilot> pilots;
	@ManyToMany
	@JoinTable(name = "f_p_join", joinColumns = @JoinColumn(name = "flight_fk"), inverseJoinColumns = @JoinColumn(name="passenger_fk"))
	private List<Passenger> passengers;
	
	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FlightDestination getFlightOrgin() {
		return flightOrgin;
	}

	public void setFlightOrgin(FlightDestination flightOrgin) {
		this.flightOrgin = flightOrgin;
	}

	public FlightDestination getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(FlightDestination flightDestination) {
		this.flightDestination = flightDestination;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}

	public Airplan getAirplaneDetail() {
		return airplaneDetail;
	}

	public void setAirplaneDetail(Airplan airplaneDetail) {
		this.airplaneDetail = airplaneDetail;
	}

	public List<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(List<Pilot> pilots) {
		this.pilots = pilots;
	}

	@Override
	public String toString() {
		return "Flight [Id=" + id + ", flightOrgin=" + flightOrgin + ", flightDestination=" + flightDestination
				+ ", price=" + price + ", flightTime=" + flightTime + ", airplaneDetail=" + airplaneDetail + ", pilots="
				+ pilots + "]";
	}

	

}
