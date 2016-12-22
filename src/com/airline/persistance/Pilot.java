package com.airline.persistance;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pilot
 *
 */
@NamedQuery(name="Pilot.findById", query="SELECT p FROM Pilot p WHERE p.id = :id")
@Entity

public class Pilot implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;

	public Pilot() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String firstName;
	private String lastName;
	private int pilotLicense;
	@Enumerated(EnumType.STRING)
	private PilotRank pilotrank;
	@ManyToOne
	@JoinColumn(name = "flight_fk")
	private Flight flightPilot;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getPilotLicense() {
		return pilotLicense;
	}

	public void setPilotLicense(int pilotLicense) {
		this.pilotLicense = pilotLicense;
	}

	public PilotRank getPilotrank() {
		return pilotrank;
	}

	public void setPilotrank(PilotRank pilotrank) {
		this.pilotrank = pilotrank;
	}

	public Flight getFlightPilot() {
		return flightPilot;
	}

	public void setFlightPilot(Flight flightPilot) {
		this.flightPilot = flightPilot;
	}

	@Override
	public String toString() {
		return "Pilot [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", pilotLicense="
				+ pilotLicense + ", pilotrank=" + pilotrank + ", flightPilot=" + flightPilot + "]";
	}
	
}
