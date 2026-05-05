import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        boolean addedDuplicate = trainFormation.add("Sleeper");

        System.out.println("Attempted to add duplicate Sleeper: " + addedDuplicate);
        System.out.println("Final train formation: " + trainFormation);
    }
}
