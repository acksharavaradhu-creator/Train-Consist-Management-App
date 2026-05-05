import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        List<String> bogieIds = new ArrayList<>();

        try {
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("No bogies available for search");
            }

            String searchKey = "B2";
            boolean found = false;
            for (String bogieId : bogieIds) {
                if (bogieId.equals(searchKey)) {
                    found = true;
                    System.out.println("Bogie found");
                    break;
                }
            }

            if (!found) {
                System.out.println("Bogie not found");
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
