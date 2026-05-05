import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));
        bogies.add(new Bogie("General", 100));
        bogies.add(new Bogie("Economy", 45));

        // Loop-based approach
        long loopStartTime = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.getCapacity() > 50) {
                loopResult.add(bogie);
            }
        }
        long loopEndTime = System.nanoTime();
        long loopDuration = loopEndTime - loopStartTime;

        // Stream-based approach
        long streamStartTime = System.nanoTime();
        List<Bogie> streamResult = bogies.stream()
                .filter(bogie -> bogie.getCapacity() > 50)
                .collect(Collectors.toList());
        long streamEndTime = System.nanoTime();
        long streamDuration = streamEndTime - streamStartTime;

        System.out.println("Performance Comparison (Capacity > 50):");
        System.out.println("\nLoop-Based Execution Time: " + loopDuration + " nanoseconds");
        System.out.println("Loop-Based Result Count: " + loopResult.size());

        System.out.println("\nStream-Based Execution Time: " + streamDuration + " nanoseconds");
        System.out.println("Stream-Based Result Count: " + streamResult.size());

        System.out.println("\nFiltered Bogies (Both methods):");
        loopResult.forEach(bogie -> 
            System.out.println(bogie.getName() + " → " + bogie.getCapacity())
        );
    }
}
