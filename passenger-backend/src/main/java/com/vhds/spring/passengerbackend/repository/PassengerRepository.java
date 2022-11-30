package com.vhds.spring.passengerbackend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.vhds.spring.passengerbackend.model.Passenger;

public interface PassengerRepository extends MongoRepository<Passenger, String> {

	@Query("{name:'?0'}")
	Passenger findPassengerByName(String name);

	@Query(value = "{nationality:'?0'}", fields = "{'name':1, 'surname':1}")
	List<Passenger> findAll(String nationality);

	@Override
	public long count();
}
