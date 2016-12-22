package com.airline.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.business.PilotService;
import com.airline.persistance.Pilot;
import com.airline.persistance.PilotRank;

/**
 * Servlet implementation class CreatePiloteAndAddToFlight
 */
@WebServlet("/CreatePiloteAndAddToFlight")
public class CreatePiloteAndAddToFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @EJB
       PilotService ps;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePiloteAndAddToFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName = request.getParameter("firstName");
		String lName = request.getParameter("lastName");
		int license = Integer.parseInt(request.getParameter("license"));
		String rank = request.getParameter("rank");
		String fid = request.getParameter("fid");
		
		Pilot p = new Pilot();
		p.setFirstName(fName);
		p.setLastName(lName);
		p.setPilotLicense(license);
		p.setPilotrank(PilotRank.valueOf(rank));
		ps.addNewPilotToFlight(p, fid);
		response.sendRedirect("Flights");
	}

}
