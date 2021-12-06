package com.service;

import java.util.ArrayList;

import com.bean.Passenger;
import com.bean.Travel;

public interface TravelService {
	boolean checkForBusAvailibility(String source,String destination);
	ArrayList<Travel> listOfAllBus();
	ArrayList<Passenger> listOfAllPassenger();
	boolean addPassenger(Passenger passenger);
}
