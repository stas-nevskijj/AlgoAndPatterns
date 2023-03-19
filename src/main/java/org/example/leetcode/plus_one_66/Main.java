package org.example.leetcode.plus_one_66;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOneVer2(new int[]{1, 2, 9})));
    }

    static int[] plusOne(int[] digits) {
        int index = digits.length - 1;

        while (digits[index] == 9) {
            digits[index--] = 0;

            if (index < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if (index >= 0) {
            digits[index]++;
        }
        return digits;
    }

//    static int[] plusOneVer2(int[] digits) {
//        for (int i = 0; i < digits.length; i++) {
//            String s += Integer.toString(digits[i]);
//        }
//        int i = Integer.parseInt(s);
//        i++;
//        String s1 = Integer.toString(i);
//        int[] ints = s1.chars().toArray();
//        return ints;
//    }
}
