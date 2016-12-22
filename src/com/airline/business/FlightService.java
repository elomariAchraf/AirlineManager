package com.airline.business;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.airline.persistance.Airplan;
import com.airline.persistance.Flight;
import com.airline.persistance.Passenger;
import com.airline.persistance.Pilot;

/**
 * Session Bean implementation class FlightService
 */
@Stateless
@LocalBean
public class FlightService {

	/**
	 * Default constructor.
	 */
	public FlightService() {
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext(unitName = "airline")
	EntityManager em;

	public void AddFlight(Flight f, Airplan a) {
		em.persist(f);
		// em.persist(a);

	}

	public void addPilotToFlight(String pilotId, String flightId) {
		TypedQuery<Flight> fQuery = em.createNamedQuery("flight.findById", Flight.class);
		fQuery.setParameter("id", Integer.parseInt(flightId));
		Flight f = fQuery.getSingleResult();
		TypedQuery<Pilot> pQuery = em.createNamedQuery("Pilot.findById", Pilot.class);
		pQuery.setParameter("id", Integer.parseInt(pilotId));
		Pilot p = pQuery.getSingleResult();

		List<Pilot> pList = f.getPilots();
		pList.add(p);

		f.setPilots(pList);
		p.setFlightPilot(f);
	}

	public void addPassengerToFlight(String pid, String fid) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Passenger> cqPassenger = builder.createQuery(Passenger.class);
		Root<Passenger> pRoot = cqPassenger.from(Passenger.class);
		cqPassenger.select(pRoot).where(builder.equal(pRoot.get("id").as(Integer.class), pid));
		Passenger p = em.createQuery(cqPassenger).getSingleResult();

		builder = em.getCriteriaBuilder();
		CriteriaQuery<Flight> cqFlight = builder.createQuery(Flight.class);
		Root<Flight> fRoot = cqFlight.from(Flight.class);
		cqFlight.select(fRoot).where(builder.equal(fRoot.get("id").as(Integer.class), fid));
		Flight f = em.createQuery(cqFlight).getSingleResult();

		List<Passenger> pList = f.getPassengers();
		pList.add(p);
		f.setPassengers(pList);
		p.getFlights().add(f);

	}

	public List<Flight> getFlights() {
		TypedQuery<Flight> query = em.createQuery("SELECT f FROM Flight f", Flight.class);
		List<Flight> results = query.getResultList();
		return results;
	}

}
