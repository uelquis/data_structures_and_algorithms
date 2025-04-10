package dev.uelquis.algo_and_data_structures;

import dev.uelquis.algo_and_data_structures.binary_tree.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        var tree = new Node<Integer>(10,
                new Node<Integer>(8,
                        new Node<Integer>(2),
                        new Node<Integer>(9)
                ),
                new Node<Integer>(14));

        double[] arr = {3, 2, 9, 1};
        var sorted = InsertionSort.sort(arr, SortingOrder.ASCENDING);

        System.out.println("unsorted: " + Arrays.toString(arr));
        System.out.println("sorted: " + Arrays.toString(sorted));
    }
}