package org.example.leetcode.first_unique_value;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 0, -7, -7, 2, 5, 1, 2, 1};
        int firstUniqueValue = getFirstUniqueValue(array);
        System.out.println(firstUniqueValue);
    }

    static int getFirstUniqueValue(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(array).boxed().forEach(e -> map.merge(e, 1, (prev, cur) -> prev + cur));
        return Arrays.stream(array).filter(e -> map.get(e) == 1).findFirst().getAsInt();
    }
}
