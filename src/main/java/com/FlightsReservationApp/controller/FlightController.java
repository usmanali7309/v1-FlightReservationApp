package com.FlightsReservationApp.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FlightsReservationApp.entities.Flight;
import com.FlightsReservationApp.repository.FlightRepository;


@Controller
public class FlightController {
	@Autowired
	private FlightRepository flightRepo;

	@RequestMapping("/findFlights")
	public String findFlight(@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("departureDate") @DateTimeFormat(pattern="dd-MM-yyyy") Date departureDate,ModelMap modelMap) {
		List<Flight> findFlights = flightRepo.findFlights(from,to,departureDate);
		modelMap.addAttribute("findFlights", findFlights);
			return "displayFlights";
		
		
	}
	
	@RequestMapping("/showCompliteResevation")
	public String showCompliteResevation(@RequestParam("FlightId") Long flightId,ModelMap modelMap) {
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		modelMap.addAttribute("flight", flight);
		return "showReservation";
	}
	
}
