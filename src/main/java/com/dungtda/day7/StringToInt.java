package com.dungtda.day7;

import java.util.ArrayList;
import java.util.List;

public class StringToInt {

    public static void main(String[] args) {
        System.out.println(myAtoi("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000522545459"));
    }

    public static int myAtoi(String s) {
        int sign = 1;
        List<Integer> digits = new ArrayList<>();

        if (s == null || s.isBlank()) return 0;
        s = s.trim();

        boolean start = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-'){
                if (i != 0) break;
                sign = -1;
                start = true;
            }
            else if (c == '+') {
                if (i != 0) break;
                start = true;
            } else if (c == '0') {
                if (start) digits.add(Integer.parseInt(String.valueOf(c)));
            }
            else if (c >= '1' && c <= '9') {
                digits.add(Integer.parseInt(String.valueOf(c)));
                start = true;
            }
            else break;
        }

        if (digits.isEmpty()) return 0;

        long result = 0;
        for (int i = digits.size() -1 ; i >= 0; i--) {
            long num = (long) (digits.get(i) * Math.pow(10, digits.size() - i -1));
            if (num > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            };
            result += num;
            if (result > Integer.MAX_VALUE) break;
        }
        result = sign * result;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) result;
    }
}
