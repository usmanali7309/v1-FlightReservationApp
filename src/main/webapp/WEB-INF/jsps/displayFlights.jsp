<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flights</title>
</head>
<body bgcolor="#cce8e6">
<h2>All Flights</h2>
<hr>
<table border="1" style="border-collapes:collapes">
<tr>
<th>FlightNO</th>
<th> Airlines</th>
<th>Departure City</th>
<th>Arrival City</th>
<th>Date Of Departure</th>

<th>Select Flight</th>
</tr>
<c:forEach items="${findFlights}" var="findFlight">
<tr>
<td>${findFlight.flightNumber}</td>
<td>${findFlight.operatingAirlines}</td>
<td>${findFlight.departureCity}</td>
<td>${findFlight.arrivalCity}</td>
<td>${findFlight.dateOfDeparture}</td>

<td><a href="showCompliteResevation?FlightId=${findFlight.id}">Select Flight</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>