import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after adding: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper bogie: " + hasSleeper);

        System.out.println("Final passenger bogies: " + passengerBogies);
    }
}
