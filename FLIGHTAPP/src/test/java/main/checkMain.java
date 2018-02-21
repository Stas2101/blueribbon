package main;

public class checkMain {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Flight flight =new Flight();
		CacheMemory cache= new CacheMemory<>(100, 10000, 10) ;
		
		cache.put(1, flight.checkBaggage(111, "Fe")); 
		cache.put(2, flight.isValidCoupon(0, 1000)); 
		
		
	}

}
