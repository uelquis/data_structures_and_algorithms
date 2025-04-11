package dev.uelquis.algo_and_data_structures;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test {
    private Test() {}

    public static boolean isSorted(double[] arr, SortingOrder order) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] <= arr[i+1] && order == SortingOrder.ASCENDING
                || arr[i] >= arr[i+1] && order == SortingOrder.DESCENDING) continue;

            return false;
        }
        return true;
    }
}
