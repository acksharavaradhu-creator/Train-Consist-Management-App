public class TrainApp {
    public static void main(String[] args) {
        String[] bogieIds = {"B1", "B2", "B3", "B4", "B5"};
        String searchKey = "B3";

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                System.out.println("Bogie found");
                break;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Bogie not found");
        }
    }
}
