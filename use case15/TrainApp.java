public class TrainApp {
    public static void main(String[] args) {
        Bogie bogie = new Bogie("Rectangular");

        try {
            System.out.println("Attempting to assign Petroleum to Rectangular bogie...");
            bogie.assignCargo("Petroleum");
            System.out.println("✓ Cargo assigned successfully");
        } catch (CargoSafetyException e) {
            System.out.println("✗ CargoSafetyException caught: " + e.getMessage());
        } finally {
            System.out.println("Operation completed");
        }

        System.out.println("\nAttempting to assign Food to Rectangular bogie...");
        try {
            bogie.assignCargo("Food");
            System.out.println("✓ Cargo assigned successfully: " + bogie.getCargo());
        } catch (CargoSafetyException e) {
            System.out.println("✗ CargoSafetyException caught: " + e.getMessage());
        } finally {
            System.out.println("Operation completed");
        }
    }
}
