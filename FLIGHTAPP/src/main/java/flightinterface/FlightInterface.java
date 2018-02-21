package flightinterface;

public interface FlightInterface {
	
	public boolean checkTicketId(int ticketNum);
	
	public boolean checkBaggage(int destinationId, String baggageId);
	
	public double isValidCoupon(int couponId, double price );

}
