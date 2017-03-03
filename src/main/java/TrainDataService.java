import java.util.List;

import com.mashape.unirest.http.exceptions.UnirestException;

public interface TrainDataService {

	public List<Seat> getTrainData(String trainId) throws UnirestException;
	
}
