<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@
page import="java.util.*, com.airline.models.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Flight list</title>
</head>
<body>
	<h3>List of flights</h3>
	<table>
		<tr>
			<th>ID</th>
			<th>From</th>
			<th>To</th>
			<th>Time</th>
			<th>Price</th>
			<th>Airplane</th>
			<th>Seating</th>
			<th>Numbre of Pilots</th>
			<th>Pilots names</th>


		</tr>

		<%
			List<Flight> fl = (List<Flight>) request.getAttribute("flight_list");
			for (int i = 0; i < fl.size(); i++) {
		%>
		<tr>
			<td><%=fl.get(i).getId()%></td>
			<td><%=fl.get(i).getFlightOrgin()%></td>
			<td><%=fl.get(i).getFlightDestination()%></td>
			<td><%=fl.get(i).getFlightTime()%></td>
			<td><%=fl.get(i).getPrice()%></td>
			<td><%=fl.get(i).getAirplaneDetail().getPlaneMake() + " "
						+ fl.get(i).getAirplaneDetail().getModelName()%></td>
			<td><%=fl.get(i).getAirplaneDetail().getSeatingCapacity()%></td>
			<td>
				<%
					if (fl.get(i).getPilots() != null) {
				%> <%=fl.get(i).getPilots().size()%>
				Pilots <%
 	} else {
 %>No Pilots Yet <%
 	}
 %>
			</td>

			<td>
				<%
					if (fl.get(i).getPilots() != null) {
							List<Pilot> pl = (List<Pilot>) fl.get(i).getPilots();
							for (int j = 0; j < pl.size(); j++) {
				%> <%=(j + 1) + ") " + pl.get(j).getFirstName() + " " + pl.get(j).getLastName() + " ("
								+ pl.get(j).getPilotrank() + ") <br />"%>

				<%
					}
						}
				%>
			</td>
		</tr>
		<tr>
			<td colspan="9">
				<%
					if (fl.get(i).getPassengers().size() > 0) {
							List<Passenger> pl = (List<Passenger>) fl.get(i).getPassengers();
							for (int k = 0; k < pl.size(); k++) {
				%> <%=k + 1%>) <%=pl.get(k).getFirstName()%> <%=pl.get(k).getLastName()%><br>
				<%
					}
						} else {
				%> No Passengers on this flight yet <%
					}
				%>
			</td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>