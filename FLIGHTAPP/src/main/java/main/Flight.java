package main;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import flightinterface.FlightInterface;

public class Flight implements FlightInterface {
	
	private static final List<Integer> listOfTicketIds = Arrays.asList(123, 134, 24);
	private static final List<Integer> listOfCouponIds = Arrays.asList(111, 22, 24);
	private static final List<Long> listOfDis = Arrays.asList((long)0.1, (long)0.5,(long) 0.6);
	private static final Map<String, Integer> myMap = new HashMap<String, Integer>();
	int max = 2;
	int min = 0;
	
    static {
        myMap.put("Ess", 111);
        myMap.put("SS", 111);
        myMap.put("Fe", 1111);
    }
	
	@Override
	public boolean checkTicketId(int ticketNum) {
		if(listOfTicketIds.contains(ticketNum))
		return true;
		
		return false;
	}

	@Override
	public boolean checkBaggage(int destinationId, String baggageId) {
			if(myMap.containsKey(baggageId)&&myMap.get(baggageId)==destinationId)
				return true;
		return false;
	}

	@Override
	public double isValidCoupon(int couponId, double price) {
		if(listOfCouponIds.contains(couponId)){
			Random rand = new Random();
			int num =rand.nextInt((max - min) + 1) + min;
			price *= (1-listOfDis.get(num));
			return price;
		}
		
		
		return price;
	}
	
	
	
	

}
