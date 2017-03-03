package trainservice;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

import trainservice.RestBookingIdService;
import trainservice.interfaces.BookingIdService;

public class BookingIdServiceTest {
	
	BookingIdService cut = new RestBookingIdService();
	
	@Test
	public void bookingIdIsValid() {
		String id = cut.getUniqueBookingId();
		assertThat(id).isNotNull();
		assertThat(id).isNotBlank();
	}
	
	@Test
	public void idsAreUnique() {
		List<String> ids = IntStream.range(0, 1000)
				.mapToObj(i -> cut.getUniqueBookingId())
				.collect(Collectors.toList());
		assertThat(ids).containsOnlyOnce(ids.toArray(new String[0]));
	}

}
