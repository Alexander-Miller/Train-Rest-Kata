import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RestTrainDataService implements TrainDataService {
	
	private static final String TRAIN_DATA_URL = "http://localhost:8081/data_for_train/%s";

	@Override
	public List<Seat> getTrainData(String trainId) throws UnirestException {
		
		String url = String.format(TRAIN_DATA_URL, trainId);
		
		HttpResponse<JsonNode> response = Unirest.get(url).asJson();
		
		JSONObject seats = response.getBody().getObject().getJSONObject("seats");
		Gson gson = new Gson();
		
		List<Seat> result = new ArrayList<>();
		
		for (String key : seats.keySet()) {
			JSONObject jsonObject = seats.getJSONObject(key);
			result.add(gson.fromJson(jsonObject.toString(), Seat.class));
		}
		
		
//		
//		gson.
//		
//		Seat[] seatArray = gson.fromJson(response.getBody(), Seat[].class);
//		return Arrays.asList(seatArray);
		return result;
	}

}
