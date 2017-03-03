package trainservice;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.apache.http.HttpStatus;
import org.junit.Test;

import trainservice.Reservation;
import trainservice.RestReservationService;
import trainservice.Seat;
import trainservice.interfaces.ReservationService;

public class RestReservationServiceTest {
	
	ReservationService cut = new RestReservationService();
	
	@Test
	public void singleReservationInEmptyTrain() {
		Reservation reservation = new Reservation("local_1000", Arrays.asList(new Seat("A", 1)), "ID_ABC");
		HttpStatus status = cut.makeReservation(reservation);
		assertThat(status).isSameAs(HttpStatus.SC_OK);
	}
	
}
