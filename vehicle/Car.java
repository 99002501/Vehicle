package com.ltts.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator {

	@Override
	public void showMileage(int x) {
		// TODO Auto-generated method stub
		System.out.println("Car mileage is "+x);
		
	}

}
