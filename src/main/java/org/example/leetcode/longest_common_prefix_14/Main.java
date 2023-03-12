package org.example.leetcode.longest_common_prefix_14;

public class Main {
    public static void main(String[] args) {

    }

    String longestCommonPrefix(String[] strs) {
//        flower
//        flow
//        flight
//
//        String prefix = strs[0];
//        while (true) {
//            if (strs[1].contains(prefix)) {
//                break;
//            }
//        }

        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
            }
        }
        return result;

    }
}
