package com.ltts.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {
	@Autowired
	@Qualifier("car")
	MileCalculator cmileCalculator;
	@Autowired
	@Qualifier("bike")
	MileCalculator bmileCalculator;
	public void getMileage(String choice) {
		if(choice == "car"){
			 cmileCalculator.showMileage(100);
		}
		else {
			 bmileCalculator.showMileage(66);
		}
	}
	
	
	
	

}
