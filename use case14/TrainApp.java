import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        // Valid bogie
        try {
            Bogie sleeper = new Bogie("Sleeper", 72);
            bogies.add(sleeper);
            System.out.println("✓ Successfully added: " + sleeper.getName() + " with capacity " + sleeper.getCapacity());
        } catch (InvalidCapacityException e) {
            System.out.println("✗ Error adding bogie: " + e.getMessage());
        }

        // Invalid bogie
        try {
            Bogie acChair = new Bogie("AC Chair", 0);
            bogies.add(acChair);
            System.out.println("✓ Successfully added: " + acChair.getName() + " with capacity " + acChair.getCapacity());
        } catch (InvalidCapacityException e) {
            System.out.println("✗ Error adding bogie: " + e.getMessage());
        }

        System.out.println("\nTotal valid bogies added: " + bogies.size());
    }
}
