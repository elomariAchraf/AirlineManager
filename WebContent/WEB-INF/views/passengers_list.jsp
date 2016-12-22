<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@
page import="java.util.*, com.airline.models.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Passenger list</title>
</head>
<body>
	<h3>List of passengers</h3>
	<table>
		<tr>
			<th>ID</th>
			<th>First name</th>
			<th>Last name</th>
			<th>Date of birth</th>
			<th>Gender</th>
		</tr>

		<%
			List<Passenger> pl = (List<Passenger>) request.getAttribute("passenger_list");
			for (int i = 0; i < pl.size(); i++) {
		%>
		<tr>
			<td><%=pl.get(i).getId()%></td>
			<td><%=pl.get(i).getFirstName()%></td>
			<td><%=pl.get(i).getLastName()%></td>
			<td><%=pl.get(i).getDob()%></td>
			<td><%=pl.get(i).getGender()%></td>
		</tr>
		<tr>
			<td colspan="5">
				<%
					if (pl.get(i).getFlights().size() > 0) {
							List<Flight> fl = pl.get(i).getFlights();
							for (int k = 0; k < fl.size(); k++) {
				%> <%=k+1%>)<%=fl.get(k).getFlightOrgin()%> To <%=fl.get(k).getFlightDestination()%>
				at <%=fl.get(k).getFlightTime()%><br /> <%
 	}
 		}else{
 %>
 No flight ticket yet
 <%
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