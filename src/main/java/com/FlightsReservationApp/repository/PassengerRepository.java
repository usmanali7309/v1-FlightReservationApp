package com.FlightsReservationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightsReservationApp.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
