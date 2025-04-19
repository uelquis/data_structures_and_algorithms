package dev.uelquis.algo_and_data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class InsertionSort {
    private InsertionSort() {}

    /*
    * Best case complexity: O(n) -> when the array is already sorted.
    * Average case complexity: O(n^2)
    * Worst case complexity: o(n^2) -> when the array is in reverse order.
    *
    * One of the best algorithms to sort small arrays, it is faster than Quicksort when
    * sorting small amounts of elements. The algorithm compares the $currentElement to previous
    * ones that are part of a partially sorted list, then it is sorted.
    *
    * */

    public static double[] sort(double[] arr, SortingOrder order) {
        int insertIndex;
        double currentValue;
        double[] sorted = new double[arr.length];

        ArrayList<Double> tmp = Arrays.stream(arr.clone())
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        for (int i = 1; i < tmp.size(); i++) {
            insertIndex = i;
            currentValue = tmp.get(i);
            tmp.remove(i);

            for (int j = i - 1; j >= 0 ; j--) {
                if(tmp.get(j) < currentValue && order == SortingOrder.ASCENDING
                    || tmp.get(j) > currentValue && order == SortingOrder.DESCENDING ) continue;

                insertIndex = j;
            }
            tmp.add(insertIndex, currentValue);
        }

        for (int i = 0; i < tmp.size(); i++) {
            sorted[i] = tmp.get(i);
        }

        return sorted;
    }
}
