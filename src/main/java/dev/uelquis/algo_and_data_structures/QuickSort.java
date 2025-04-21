package dev.uelquis.algo_and_data_structures;

public class QuickSort {
    private QuickSort(){}
    /*
    * Best case complexity: O(n log n) -> when the pivot divides the array into
    *   two equal halves.
    * Average case complexity: O(n log n) -> when the pivot divides the array into
    *   two different parts.
    * Worst case complexity: o(n^2) -> when the smallest or largest element is chosen
    *   as pivot.
    *
    * Works recursively on the principle of divide-and-conquer. First, a pivot
    * is selected, then all the elements that are greater than the pivot stay in
    * the right and the smaller ones are moved to the left. It is an optimal choice
    * for sorting large data sets ( just like merge sort ), it has low usage of memory,
    * it's the best algorithm when stability is not necessary, despite being not good for
    * small data sets.
    *
    * */

    public static double[] sort(double[] arr, SortingOrder order) {
        double[] sorted = arr.clone();

        sort(sorted, order, 0, sorted.length - 1);

        return sorted;
    }

    private static void sort(double[] arr, SortingOrder order, int low, int high) {
        if(low >= high) return;

        int partitionIndex = partition(arr, order, low, high);

        sort(arr, order, low, partitionIndex - 1);
        sort(arr, order, partitionIndex + 1, high);
    }

    private static int partition(double[] arr, SortingOrder order, int low, int high) {

        double pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high; j++) {
            if(arr[j] >= pivot && order == SortingOrder.ASCENDING
                || arr[j] <= pivot && order == SortingOrder.DESCENDING) continue;

            i++;
            swap(arr, i, j);
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(double[] arr, int i, int j) {
        double tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
