package com.FlightsReservationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightsReservationApp.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
