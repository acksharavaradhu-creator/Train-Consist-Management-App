import java.util.Arrays;

public class TrainApp {
    public static void main(String[] args) {
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        System.out.println("Original bogie types: " + Arrays.toString(bogieTypes));

        Arrays.sort(bogieTypes);

        System.out.println("Sorted bogie types: " + Arrays.toString(bogieTypes));
    }
}
