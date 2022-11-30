package com.vhds.flightbackend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.vhds.flightbackend.model.Flight;

public interface FlightRepository extends MongoRepository<Flight, String> {
  
	@Query("{flightNumber:'?0'}")
    Flight findItemByName(String flightNumber);
    
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<Flight> findAll(String category);
    
    public long count();
}
