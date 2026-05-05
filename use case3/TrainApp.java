import java.util.HashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");

        boolean addedDuplicate = bogieIds.add("B2");

        System.out.println("Attempted to add duplicate B2: " + addedDuplicate);
        System.out.println("Bogie IDs in the train: " + bogieIds);
    }
}
