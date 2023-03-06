package org.example.algos.binary_search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 5));
    }

static int binarySearch(int[] array, int num) {
    int low = array[0];
    int high = array[array.length - 1];

    while (low <= high) {
        int mid = (high - low) / 2 + low;
        if (array[mid] > num) {
            high = mid - 1;
        } else if (array[mid] < num) {
            low = mid + 1;
        } else if (array[mid] == num) {
            return mid;
        }
    }
    return -1;
}

}

