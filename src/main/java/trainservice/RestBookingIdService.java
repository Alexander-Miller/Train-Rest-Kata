package trainservice;

import trainservice.interfaces.BookingIdService;

public class RestBookingIdService implements BookingIdService {

	private static final String BOOKING_URL = "http://127.0.0.1:8082/booking_reference";

	@Override
	public String getUniqueBookingId() {
		return null;
	} 
}
