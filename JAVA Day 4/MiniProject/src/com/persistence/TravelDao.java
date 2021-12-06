package com.persistence;

import java.util.ArrayList;

import com.bean.Passenger;
import com.bean.Travel;

public interface TravelDao {
	ArrayList<Travel> listAllBus();
	ArrayList<Passenger> listAllPassenger();
	boolean checkAvailability(String source,String destination);
	int addPassenger(Passenger passenger);
}
