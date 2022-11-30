package com.vhds.flightbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.vhds.flightbackend.model.Flight;
import com.vhds.flightbackend.repository.FlightRepository;

@SpringBootApplication
@EnableMongoRepositories
public class FlightBackendApplication implements CommandLineRunner{
	
@Autowired
FlightRepository flightRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(FlightBackendApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Flight f1 = new Flight("number1", "company1", "timeDay1", "transitTime1", true, 1, true, 51);
		Flight f2 = new Flight("number2", "company2", "timeDay2", "transitTime2", true, 2, true, 52);
		Flight f3 = new Flight("number3", "company3", "timeDay3", "transitTime3", true, 3, true, 53);

		flightRepo.save(f1);
		flightRepo.save(f2);
		flightRepo.save(f3);

		System.out.println("****************************");
		List<Flight> flights = flightRepo.findAll();
		for (Flight flight : flights) {
			System.out.println(flight);
		}
	}
}
