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
 * Servlet implementation class AddPilot
 */
@WebServlet("/AddPilot")
public class AddPilot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @EJB
       PilotService ps;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPilot() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pilot p = new Pilot();
		p.setFirstName("Said");
		p.setLastName("Manam");
		p.setPilotrank(PilotRank.Captain);
		p.setPilotLicense(15487);
		ps.addPilot(p);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
