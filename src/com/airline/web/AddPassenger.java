package com.airline.web;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.business.PassengerService;
import com.airline.persistance.FlightClass;
import com.airline.persistance.Gender;
import com.airline.persistance.Passenger;

/**
 * Servlet implementation class AddPassenger
 */
@WebServlet("/AddPassenger")
public class AddPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @EJB
       private PassengerService ps;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPassenger() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String raw = request.getParameter("dob");
		String gender = request.getParameter("gender");
		
		Passenger p = new Passenger();
		p.setFirstName(firstName);
		p.setLastName(lastName);
		String[] dobArray = raw.split("\\/");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(dobArray[2]));
		cal.set(Calendar.MONTH, Integer.parseInt(dobArray[0]));
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dobArray[1]));
		Date dob = cal.getTime();
		p.setDob(dob);
		p.setGender(Gender.valueOf(gender));
		ps.addPassenger(p);
		response.sendRedirect("Passengers");
	}

}
