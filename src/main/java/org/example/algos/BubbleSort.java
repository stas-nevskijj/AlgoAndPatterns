package org.example.algos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 6, 8, 1, 6};
        System.out.println(bubbleSort(arr));
    }

    static String bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i ++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return Arrays.toString(array);
    }
}
