import java.util.List;

import org.junit.Test;

public class TrainDataServiceTest {

	TrainDataService cut = new RestTrainDataService();
	
	@Test
	public void f() throws Exception {
		List<Seat> trainData = cut.getTrainData("local_1000");
		for (Seat seat : trainData) {
			System.out.println(seat);
		}
	}
	
}
