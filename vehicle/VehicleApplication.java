package com.ltts.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class VehicleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VehicleApplication.class, args);
	}
	
	@Autowired
	ApplicationContext context;
	VehicleDetails vd;
	
	  

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 VehicleDetails vd= context.getBean(VehicleDetails.class);
		 vd.getMileage("car");
		
	}
	  
}
