import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));

        int totalCapacity = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("Bogie Details:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie.getName() + " → " + bogie.getCapacity());
        }

        System.out.println("\nTotal Seating Capacity: " + totalCapacity);
    }
}
