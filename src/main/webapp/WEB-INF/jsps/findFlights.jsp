<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search flight</title>
</head>
<body bgcolor="lightblue">
<h2>Find Flights..</h2>
<hr>
<form action="findFlights" method ="post">
<pre>
           From: <input type="text" name="from"/>
 
             To: <input type="text" name="to"/>
 
 Departure Date: <input type="text" name="departureDate"/>
 
                 <input type="submit" value="Search"/>
</pre>
</form>

</body>
</html>