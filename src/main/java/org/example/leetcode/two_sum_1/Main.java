package org.example.leetcode.two_sum_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 22)));
        System.out.println(Arrays.toString(mapTwoSum(arr, 22)));
    }

//    Сложность O(N^2)
    static int[] twoSum(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[0];
    }

    static int[] mapTwoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int required = target - array[i];
            if (map.containsKey(required) && map.get(required) != i) {
                return new int[] {i, map.get(required)};
            }
        }
        throw new IllegalArgumentException();
    }
}
