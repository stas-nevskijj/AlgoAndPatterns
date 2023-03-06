package org.example.algos.selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53};

        for (int step = 0; step < array.length; step++) {
            int index = min(array, step);

            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }



    private static int min(int[] array, int start) {
        int minValue = array[start];
        int minIndex = start;

        for (int i = start + 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
