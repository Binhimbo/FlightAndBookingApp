package com.vhds.spring.passengerbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.vhds.spring.passengerbackend.model.Passenger;
import com.vhds.spring.passengerbackend.repository.PassengerRepository;

@SpringBootApplication
@EnableMongoRepositories
public class MdbSpringBootApplication implements CommandLineRunner {

	@Autowired
	PassengerRepository passengerRepo;

	public static void main(String[] args) {
		SpringApplication.run(MdbSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Passenger p1 = new Passenger("id1", "namePassenger1", "surnamePassenger1", "Mongo", 51, false);
		Passenger p2 = new Passenger("id2", "namePassenger2", "surnamePassenger2", "Mongo", 52, false);
		Passenger p3 = new Passenger("id3", "namePassenger3", "surnamePassenger3", "SQL", 53, true);

		passengerRepo.save(p1);
		passengerRepo.save(p2);
		passengerRepo.save(p3);

		System.out.println("****************************");
		List<Passenger> passengers = passengerRepo.findAll();
		for (Passenger passenger : passengers) {
			System.out.println(passenger);
		}
	}

}
