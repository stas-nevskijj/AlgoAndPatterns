package org.example.leetcode.merge_worted_arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] merge = merge(new int[]{0, 1, 2, 3, 5, 7, 7}, new int[]{0, 2, 6, 7, 11});
        System.out.println(Arrays.toString(merge));
    }

    static int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];
        int i = 0;
        int idxA = 0;
        int idxB = 0;

        while (i < result.length) {
            if (idxA >= a.length) {
                result[i++] = b[idxB++];
                continue;
            }
            if (idxB >= b.length) {
                result[i++] = a[idxA++];
                continue;
            }
            if (a[idxA] <= b[idxB]) {
                result[i++] = a[idxA++];
            } else {
                result[i++] = b[idxB++];
            }
        }
        return result;
    }
}
