package com.FlightsReservationApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlightsReservationApp.dto.ReservationRequest;
import com.FlightsReservationApp.entities.Flight;
import com.FlightsReservationApp.entities.Passenger;
import com.FlightsReservationApp.entities.Reservation;
import com.FlightsReservationApp.repository.FlightRepository;
import com.FlightsReservationApp.repository.PassengerRepository;
import com.FlightsReservationApp.repository.ReservationRepository;

import com.FlightsReservationApp.utilities.PdfGenerator;

@Service
public class ReservationServiceimpl implements ReservationService {
	
	 
	
//	 @Autowired
//	 private PdfGenerator pdfgenerator;
	 
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;

	@Autowired
	private ReservationRepository reservationRepo;
	
	String filePath="E:\\tickets\\booking";

	@Override
	public Reservation bookFlight(ReservationRequest reservation) {
		

		Passenger passenger=new Passenger();
		passenger.setFirstName(reservation.getFirstName());
		passenger.setLastName(reservation.getLastName());
		passenger.setMiddleName(reservation.getMiddleName());
		passenger.setEmail(reservation.getEmail());
		passenger.setPhoneNo(reservation.getPhoneNo());
		 passengerRepo.save(passenger);
		 
		 long flightId = reservation.getFlightId();
		 Optional<Flight> findById = flightRepo.findById(flightId);
		 Flight flight = findById.get();
		 
		 Reservation reserv= new Reservation();
		 reserv.setFlight(flight);
		 reserv.setPassenger(passenger);
		 reserv.setCheckedIn(false);
		 reserv.setNumberOfBags(0);
		 
		 reservationRepo.save(reserv);
		 
		 PdfGenerator pdfgenerator=new  PdfGenerator();
		 pdfgenerator.generatePDF(reserv, filePath+reservation.getFirstName()+".pdf");
		 
		return  reserv;
		
		 
	}

}
