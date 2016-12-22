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

import com.airline.business.FlightService;
import com.airline.persistance.Airplan;
import com.airline.persistance.Flight;
import com.airline.persistance.FlightDestination;

/**
 * Servlet implementation class AddFlight
 */
@WebServlet("/AddFlight")
public class AddFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	FlightService fs;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFlight() {
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
		Flight f = new Flight();
		String from_Destination =  request.getParameter("from_destination");
		f.setFlightOrgin(FlightDestination.valueOf(from_Destination));
		String to_Destination =  request.getParameter("to_destination");
		f.setFlightDestination(FlightDestination.valueOf(to_Destination));
		String price = request.getParameter("price");
		int year = Integer.parseInt(request.getParameter("year"));
		int month = Integer.parseInt(request.getParameter("month"));
		int day = Integer.parseInt(request.getParameter("day"));
		int hour = Integer.parseInt(request.getParameter("hour"));
		int minute = Integer.parseInt(request.getParameter("minute"));
		
		
		
		
		
		f.setPrice(Integer.parseInt(price));
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, hour);
		cal.set(Calendar.MINUTE, minute);	
		Date date = cal.getTime();
		f.setFlightTime(date);
		
		Airplan a = new Airplan();
		
		String plan_make = request.getParameter("plan_make");
		String model_name = request.getParameter("model_name");
		String capacity = request.getParameter("capacity");
		
		a.setModelName(model_name);
		a.setPlaneMake(plan_make);
		a.setSeatingCapacity(Integer.parseInt(capacity));
		
		f.setAirplaneDetail(a);
		System.out.println(f);
		System.out.println(a);
		
		fs.AddFlight(f, a);
		response.sendRedirect("Flights");
		
	}

}
