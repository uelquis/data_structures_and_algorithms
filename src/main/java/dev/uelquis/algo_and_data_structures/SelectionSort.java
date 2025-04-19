package dev.uelquis.algo_and_data_structures;

public class SelectionSort {
    private SelectionSort() {}

    /*
    * Complexity = O(n^2)
    *
    * The algorithm uses two loops to order the array. The outer one controls the
    * position of the elements and the inner one compares the numbers to find the right
    * value. It is fast to sort small arrays and terrible for big arrays and does not use
    * much memory.
    * */

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
