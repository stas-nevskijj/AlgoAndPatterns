package org.example.leetcode.reverse_integer_7;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(221));
    }

    static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            result = result * 10 + pop;
        }

        return result;

    }
}
