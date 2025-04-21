package dev.uelquis.algo_and_data_structures;

import java.util.Arrays;

import static dev.uelquis.algo_and_data_structures.Test.isSorted;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ShellSortTests {
    private final double[] array = {4,2,9,0,7,9,8.5};

    @Test
    void sortAscending() {
        var sorted = ShellSort.sort(array, SortingOrder.ASCENDING);

        assertTrue(isSorted(sorted, SortingOrder.ASCENDING));
        System.out.println(Arrays.toString(sorted));
    }

    @Test
    void sortDescending() {
        var sorted = ShellSort.sort(array, SortingOrder.DESCENDING);

        assertTrue(isSorted(sorted, SortingOrder.DESCENDING));
        System.out.println(Arrays.toString(sorted));
    }
}
