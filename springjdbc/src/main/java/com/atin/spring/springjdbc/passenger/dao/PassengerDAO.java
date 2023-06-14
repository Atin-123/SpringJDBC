package com.atin.spring.springjdbc.passenger.dao;

import com.atin.spring.springjdbc.passenger.dto.Passenger;

public interface PassengerDAO {
	int create(Passenger passenger);
	int update(Passenger passenger);
	int delete(int id);
	Passenger read(int id);
	
}	
