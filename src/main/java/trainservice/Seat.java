package trainservice;
import com.google.gson.annotations.SerializedName;

public class Seat {
    public final String coach;

    @SerializedName("seat_number")
    public final int seatNumber;

    public Seat(String coach, int seatNumber) {
        this.coach = coach;
        this.seatNumber = seatNumber;
    }

    @Override
	public String toString() {
		return "Seat [coach=" + coach + ", seatNumber=" + seatNumber + "]";
	}

	public boolean equals(Object o) {
        Seat other = (Seat)o;
        return coach==other.coach && seatNumber==other.seatNumber;
    }

	public String getCoach() {
		return coach;
	}

	public int getSeatNumber() {
		return seatNumber;
	}
}