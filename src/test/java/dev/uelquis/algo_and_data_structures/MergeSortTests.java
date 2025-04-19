package dev.uelquis.algo_and_data_structures;

import java.util.Arrays;

import static dev.uelquis.algo_and_data_structures.Test.isSorted;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeSortTests {
    private final double[] array = {4,2,9,0,7,9,8.5};

    @org.junit.jupiter.api.Test
    void sortAscending() {
        var sorted = MergeSort.sort(array, SortingOrder.ASCENDING);

        assertTrue(isSorted(sorted, SortingOrder.ASCENDING));
        System.out.println(Arrays.toString(sorted));
    }

    @org.junit.jupiter.api.Test
    void sortDescending() {
        var sorted = MergeSort.sort(array, SortingOrder.DESCENDING);

        assertTrue(isSorted(sorted, SortingOrder.DESCENDING));
        System.out.println(Arrays.toString(sorted));
    }
}
