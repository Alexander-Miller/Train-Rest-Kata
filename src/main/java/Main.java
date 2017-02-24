import static spark.Spark.*;

import com.google.gson.Gson;

public class Main {


	public static void main(String[] args) {
		TicketOffice office = new TicketOffice();
		System.out.println("Started server");

		post("/reserve", (req, res) -> {
			Gson gson = new Gson();
			ReservationRequest request = gson.fromJson(req.body(), ReservationRequest.class);
			Reservation reservation = office.makeReservation(request);
			System.out.println(request);
			System.out.println(req.body());
			return gson.toJson(reservation);
		});
	}
}
