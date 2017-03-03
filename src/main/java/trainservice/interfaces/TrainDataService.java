package trainservice.interfaces;
import java.util.List;

import com.mashape.unirest.http.exceptions.UnirestException;

import trainservice.Seat;

public interface TrainDataService {

	public List<Seat> getTrainData(String trainId) throws UnirestException;
	
}
