import org.apache.http.HttpStatus;

public class RestReservationService implements ReservationService {
	
	private static final String RESERVATION_URL = "http://127.0.0.1:8081/reserve";

	@Override
	public HttpStatus makeReservation(Reservation reservation) {
		return null;
	}

}
