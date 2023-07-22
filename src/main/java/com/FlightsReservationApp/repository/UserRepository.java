package com.FlightsReservationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightsReservationApp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
