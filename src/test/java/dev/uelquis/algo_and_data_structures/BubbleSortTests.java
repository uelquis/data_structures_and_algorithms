package dev.uelquis.algo_and_data_structures;

import static org.junit.jupiter.api.Assertions.*;
import static dev.uelquis.algo_and_data_structures.Test.isSorted;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {
    private final double[] array = {4,2,9,0,7,9};

    @Test
    void sortAscending() {
        var sorted = BubbleSort.sort(array, SortingOrder.ASCENDING);

        assertTrue(isSorted(sorted, SortingOrder.ASCENDING));
    }

    @Test
    void sortDescending() {
        var sorted = BubbleSort.sort(array, SortingOrder.DESCENDING);

        assertTrue(isSorted(sorted, SortingOrder.DESCENDING));
    }
}
