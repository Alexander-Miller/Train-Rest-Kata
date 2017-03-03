import org.apache.http.HttpStatus;

public interface ReservationService {

	public HttpStatus makeReservation(Reservation reservation);
	
}
