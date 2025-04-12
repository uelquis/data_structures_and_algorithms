package dev.uelquis.algo_and_data_structures;

public class SelectionSort {
    private SelectionSort() {}

    public static double[] sort(double[] arr, SortingOrder order) {
        double[] sorted = arr.clone();
        double tmp;
        int min_index;

        for (int i = 0; i < sorted.length - 1; i++) {
            min_index = i;

            for (int j = i+1; j < sorted.length; j++) {
                if (sorted[j] > sorted[min_index] && order == SortingOrder.ASCENDING
                    || sorted[j] < sorted[min_index] && order == SortingOrder.DESCENDING) continue;

                min_index = j;
            }
            tmp = sorted[i];
            sorted[i] = sorted[min_index];
            sorted[min_index] = tmp;
        }

        return sorted;
    }

}
