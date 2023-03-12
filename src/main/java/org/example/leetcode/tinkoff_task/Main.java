package org.example.leetcode.tinkoff_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int foo = foo(new int[]{1, 2, 4, 5}, new int[]{3, 3, 4}, new int[]{2, 3, 4, 5, 6});
        System.out.println(foo);

        Thread thread = new Thread();
        thread.interrupt();
        Thread.interrupted();
        thread.isInterrupted();
    }

    static int foo(int[] array1, int[] array2, int[] array3) {

        IntStream s1 = Arrays.stream(array1).distinct();
        IntStream s2 = Arrays.stream(array2).distinct();
        IntStream s3 = Arrays.stream(array3).distinct();

        int[] array = IntStream.concat(IntStream.concat(s1, s2), s3).toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            map.merge(i, 1, Integer::sum);
            if (map.containsValue(3)) {
                return i;
            }
        }
        return -1;
    }
}
