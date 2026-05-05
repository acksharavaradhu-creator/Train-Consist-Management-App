import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(
                        bogie -> bogie.getCapacity() > 60 ? "High Capacity" : "Low Capacity"
                ));

        System.out.println("Grouped Bogies by Capacity Category:");
        groupedBogies.forEach((category, bogieList) -> {
            System.out.println("\n" + category + ":");
            bogieList.forEach(bogie -> 
                System.out.println("  " + bogie.getName() + " → " + bogie.getCapacity())
            );
        });
    }
}
