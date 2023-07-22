package com.FlightsReservationApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.FlightsReservationApp.dto.ReservationRequest;
import com.FlightsReservationApp.entities.Reservation;
import com.FlightsReservationApp.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired 
	private ReservationService reservationService;
	
	@RequestMapping("/confirmReservation")
    public String confirmReservation(ReservationRequest reservation, ModelMap modelMap) {
		Reservation bookFlight = reservationService.bookFlight(reservation);
		modelMap.addAttribute("bookFlight", bookFlight.getId());
		return "confirmReservation";
	}
}
