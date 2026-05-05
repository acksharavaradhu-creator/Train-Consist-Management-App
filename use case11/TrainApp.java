import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainApp {
    public static void main(String[] args) {
        Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

        String[] trainIds = {"TRN-1234", "TRN-12", "TRN-5678"};
        String[] cargoCodes = {"PET-AB", "PET-123", "PET-XY"};

        System.out.println("Train ID Validation (TRN-\\d{4}):");
        for (String trainId : trainIds) {
            Matcher trainMatcher = trainIdPattern.matcher(trainId);
            System.out.println(trainId + " → " + (trainMatcher.matches() ? "Valid" : "Invalid"));
        }

        System.out.println("\nCargo Code Validation (PET-[A-Z]{2}):");
        for (String cargoCode : cargoCodes) {
            Matcher cargoMatcher = cargoCodePattern.matcher(cargoCode);
            System.out.println(cargoCode + " → " + (cargoMatcher.matches() ? "Valid" : "Invalid"));
        }
    }
}
