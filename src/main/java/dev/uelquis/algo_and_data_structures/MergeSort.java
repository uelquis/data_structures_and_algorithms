package dev.uelquis.algo_and_data_structures;

import org.javatuples.Tuple;

public class MergeSort {
    private MergeSort(){}
    /*
    * Complexity: O(n log n)
    *
    * Works recursively using a divide-and-conquer strategy. The array is repeatedly
    * divided and sorted, then they are merged back into a sorted array. Despite being
    * memory hungry, this approach is good to sort large data sets and linked lists, and
    * is easy to parallelize.
    *
    * */

    public static double[] sort(double[] arr, SortingOrder order) {
        double[] sorted = arr.clone();

        sort(sorted, order, 0 , sorted.length - 1);

        return sorted;
    }

    private static void sort(double[] arr, SortingOrder order, int left, int right) {
        if(left >= right) return;

        int middle = left + (right - left)/2;

        sort(arr, order, left, middle);
        sort(arr, order, middle + 1, right);

        merge(arr, order, left, middle, right);
    }

    private static void merge(double[] arr, SortingOrder order, int left, int middle, int right) {
        int arrSizeL = middle - left + 1;
        int arrSizeR = right - middle;

        double[] L = new double[arrSizeL];
        double[] R = new double[arrSizeR];

        for (int i = 0; i < arrSizeL; ++i) L[i] = arr[left + i];

        for (int i = 0; i < arrSizeR; ++i) R[i] = arr[middle + 1 + i];

        int i = 0, j = 0;

        int k = left;
        while (i < arrSizeL && j < arrSizeR) {
            if (L[i] <= R[j] && order == SortingOrder.ASCENDING ||
                    L[i] >= R[j] && order == SortingOrder.DESCENDING) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < arrSizeL) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < arrSizeR) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
