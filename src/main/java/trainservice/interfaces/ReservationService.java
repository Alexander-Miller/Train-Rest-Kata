package trainservice.interfaces;
import org.apache.http.HttpStatus;

import trainservice.Reservation;

public interface ReservationService {

	public HttpStatus makeReservation(Reservation reservation);
	
}
