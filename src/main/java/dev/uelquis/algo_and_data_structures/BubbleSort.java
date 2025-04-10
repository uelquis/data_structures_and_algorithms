package dev.uelquis.algo_and_data_structures;

public class BubbleSort {
    private BubbleSort() {}

    public enum Order {
        ASCENDING, DESCENDING
    }

    public static double[] sort(double[] arr, Order order) {
        double tmp;
        double[] sorted = arr.clone();

        for (int i=0; i < sorted.length - 1; i++) {
            for(int j=0; j < sorted.length - i - 1; j++) {
                if(sorted[j] < sorted[j+1] && order == Order.ASCENDING
                        || sorted[j] > sorted[j+1] && order == Order.DESCENDING) continue;

                tmp = sorted[j];
                sorted[j] = sorted[j+1];
                sorted[j+1] = tmp;
            }
        }

        return sorted;
    }
}
