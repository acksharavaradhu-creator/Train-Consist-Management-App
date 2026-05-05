public class TrainApp {
    public static void main(String[] args) {
        String[] bogieIds = {"B1", "B3", "B2", "B5", "B4"};
        String searchKey = "B2";

        boolean found = false;
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie found");
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie not found");
        }
    }
}
