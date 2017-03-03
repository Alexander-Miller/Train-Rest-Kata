package trainservice;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import trainservice.interfaces.TrainDataService;

public class TrainDataServiceTest {

	TrainDataService cut = new RestTrainDataService();
	
	@Test
	public void validSeatsAreReturned() throws Exception {
		List<Seat> trainData = cut.getTrainData("local_1000");
		for (Seat seat : trainData) {
			assertThat(seat.getCoach()).isNotNull();
			assertThat(seat.getSeatNumber()).isNotNull();
		}
	}
	
}
