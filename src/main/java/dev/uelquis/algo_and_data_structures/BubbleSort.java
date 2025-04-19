package dev.uelquis.algo_and_data_structures;

public class BubbleSort {
    private BubbleSort() {}

    /*
    * Complexity: O(n^2)
    * Not efficient. Better used on small sets of data.
    *
    * The algorithm compares pairs of numbers and swaps them if they are not
    * in the right order. After going through the array, repeat 'til it
    * is sorted.
    * */

    public static double[] sort(double[] arr, SortingOrder order) {
        double tmp;
        double[] sorted = arr.clone();

        for (int i=0; i < sorted.length - 1; i++) {
            for(int j=0; j < sorted.length - i - 1; j++) {
                if(sorted[j] < sorted[j+1] && order == SortingOrder.ASCENDING
                        || sorted[j] > sorted[j+1] && order == SortingOrder.DESCENDING) continue;

                tmp = sorted[j];
                sorted[j] = sorted[j+1];
                sorted[j+1] = tmp;
            }
        }

        return sorted;
    }
}
