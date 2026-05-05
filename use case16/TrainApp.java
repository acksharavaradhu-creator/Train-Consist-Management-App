public class TrainApp {
    public static void main(String[] args) {
        int[] capacities = {72, 50, 30, 60, 45};

        System.out.print("Original capacities: ");
        printArray(capacities);

        bubbleSort(capacities);

        System.out.print("Sorted capacities:   ");
        printArray(capacities);
    }

    private static void bubbleSort(int[] values) {
        int n = values.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] values) {
        System.out.print("[");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if (i < values.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
