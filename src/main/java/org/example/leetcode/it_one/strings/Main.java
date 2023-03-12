package org.example.leetcode.it_one.strings;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(str(List.of("One", "Two", "Three"), "hello"));
    }

    static String str(List<String> arr, String del) {
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s).append(del);
        }
        return result.toString();
    }
}
