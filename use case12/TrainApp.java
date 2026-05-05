import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Cylindrical", "Petroleum"));
        bogies.add(new Bogie("Box", "Food"));
        bogies.add(new Bogie("Cylindrical", "Petroleum"));

        boolean isSafe = bogies.stream()
                .allMatch(bogie -> {
                    if ("Cylindrical".equals(bogie.getType())) {
                        return "Petroleum".equals(bogie.getCargo());
                    }
                    return true;
                });

        System.out.println("Train Safety Validation:");
        for (Bogie bogie : bogies) {
            System.out.println("Type: " + bogie.getType() + ", Cargo: " + bogie.getCargo());
        }

        System.out.println("\nResult: Train is " + (isSafe ? "SAFE" : "NOT SAFE"));
    }
}
