package trainservice;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TicketOfficeTest {
	
	TicketOffice cut = new TicketOffice();
    
    @Test
    public void reserveSingleSeatInEmptyRrain() {
    	String trainId = "local_1000";
		ReservationRequest req = new ReservationRequest(trainId, 1);
    	
    	Reservation result = cut.makeReservation(req);
    	
    	assertThat(result.getTrainId()).isEqualTo(trainId);
    	assertThat(result.getSeats()).hasSize(1);
    }
}
