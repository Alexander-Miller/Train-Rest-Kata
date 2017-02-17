import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class TicketOffice {
    
    public Reservation makeReservation(ReservationRequest request) throws UnirestException {
		//TODO: implement this code!
    	Unirest.post("http://httpbin.org/post")
    	  .queryString("name", "Mark")
    	  .field("last", "Polo")
    	  .asJson();
    	System.out.println();
		return null;
    }

}