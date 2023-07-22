package com.FlightsReservationApp.service;

import com.FlightsReservationApp.dto.ReservationRequest;
import com.FlightsReservationApp.entities.Reservation;


public interface ReservationService {
	 Reservation bookFlight(ReservationRequest reservation);

}
