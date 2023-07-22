<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body bgcolor="#dcf2d5">
<h2>Flight Details</h2>
<hr>
 <pre>
 <b>Flight Number:</b>       ${flight.flightNumber}
 <b>Operating Airlines:</b>  ${flight.operatingAirlines}
 <b>Departure City:</b>      ${flight.departureCity}
 <b>Arrival City:</b>        ${flight.arrivalCity}
 <b>Date Of Departure:</b>   ${flight.dateOfDeparture}
 
 </pre>
<h2>Enter The Passenger Details</h2>
<hr>
<form action="confirmReservation" method="post">
<pre>
  First Name:  <input type="text" name="firstName"/>
  
   Last Name:  <input type="text" name="lastName"/>
   
 Middle Name:  <input type="text" name="middleName"/>
 
       Email:  <input type="text" name="email"/>
       
   Phone No.:  <input type="text" name="phoneNo"/>
               <input type="hidden" name="flightId" value="${flight.id}"/>            
  <hr> 
  <h2> Payment Details</h2>  
   Name On Card: <input type="text" name="cardName"/>  
    Card Number: <input type="text" name="cardNumber"/> 
            CVV: <input type="text" name="cvv"/>  
    Expiry Date: <input type="text" name="expiryDate"/>  
    
                  <input type="submit" value="Complite Reservation"/>      
</pre>
</form>
</body>
</html>