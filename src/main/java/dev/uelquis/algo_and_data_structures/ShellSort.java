package dev.uelquis.algo_and_data_structures;

public class ShellSort {

    /*
     * Best case complexity: O(n (ln n)^2) -> when the array is already sorted.
     * Average case complexity: O(n^1.25)
     * Worst case complexity: o(n^2)
     *
     * This algorithm is a variation of Insertion Sort. It sorts elements
     * in a specific h distance, before reducing h and sorting again recursively.
     * It is good for medium sized files.
     *
     *
     * note: Time complexity depends on how to implement the gap sequences
     * between elements.
     *
     *
     * */


    public static double[] sort(double[] arr, SortingOrder order) {
        double[] sorted = arr.clone();

        int size = sorted.length;

        // gap reduced by half every iteration.
        for (int gap = size/2; gap > 0; gap /= 2) {
            for (int i = gap; i < size; ++i) {
                double tmp = sorted[i];

                boolean isAscending = order == SortingOrder.ASCENDING;

                int j;
                for (j = i; j >= gap && (sorted[j - gap] > tmp && isAscending
                        || sorted[j - gap] < tmp && !isAscending); j -= gap)
                    sorted[j] = sorted[j - gap];

                sorted[j] = tmp;
            }
        }

        return sorted;
    }
}
