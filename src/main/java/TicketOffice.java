import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class TicketOffice {

    public Reservation makeReservation(ReservationRequest request) throws UnirestException {
		//TODO: implement this code!
	    JsonNode response =
		    Unirest.get("http://localhost:8081/data_for_train/" + request.trainId).asJson().getBody();
	    System.out.println(response);



		return null;
    }

}