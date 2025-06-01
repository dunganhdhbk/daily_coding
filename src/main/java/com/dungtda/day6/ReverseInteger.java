package com.dungtda.day6;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        List<Integer> digits = new ArrayList<>();
        int sign = 1;
        long value = x;
        if (value < 0) {
            sign = -1;
            value = value * -1;
        }

        int i = 10;
        boolean start = false;
        while (i >= 0) {
            int digit = (int) (value / Math.pow(10, i)) % 10;
            i--;
            if (digit != 0) start = true;
            if (!start) continue;
            digits.add(digit);
        }

        long result = 0L;
        for (i = 0; i < digits.size(); i++) {
            result += (long) (digits.get(i) * Math.pow(10, i));
        }

        if (result >= Integer.MAX_VALUE) {
            return 0;
        }
        return (int) result * sign;
    }
}
