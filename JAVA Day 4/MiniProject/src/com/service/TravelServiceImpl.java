package com.service;

import java.util.ArrayList;

import com.bean.Passenger;
import com.bean.Travel;
import com.persistence.TravelDaoImpl;

public class TravelServiceImpl implements TravelService  {
	 private TravelDaoImpl travel=new TravelDaoImpl();
	    public int busId(String src,String dest) {
	    	return travel.getBusId(src, dest);
	    }
		@Override
		public boolean checkForBusAvailibility(String source, String destination) {
			return travel.checkAvailability(source, destination);
			
		}

		@Override
		public ArrayList<Travel> listOfAllBus() {
			
			return travel.listAllBus();
		}
	    public ArrayList<Passenger> listOfAllPassenger(){
	    	return travel.listAllPassenger();
	    }
		@Override
		public boolean addPassenger(Passenger passenger) {
			int rows=travel.addPassenger(passenger);
			if(rows>0)
				return true;
			return false;
		}
}
