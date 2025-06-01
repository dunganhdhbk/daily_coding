package com.dungtda.day7;

import java.util.ArrayList;
import java.util.List;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }

    public static String intToRoman(int num) {
        Character[] chars = new Character[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            int digit = (int) (num / Math.pow(10, i));
            digits[i] = digit;
            num %= (int) Math.pow(10, i);
        }

        List<Character> charList = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            int digit = digits[i];
            if (digit == 0) continue;
            if (digit == 4) {
                charList.add(chars[2 * i + 1]);
                charList.add(chars[2 * i]);
            } else if (digit == 9) {
                charList.add(chars[2 * i + 2]);
                charList.add(chars[2 * i]);
            } else if (digit == 5) {
                charList.add(chars[2 * i + 1]);
            } else if (digit > 5) {
                for (int j = 0; j < digit % 5; j++) {
                    charList.add(chars[2 * i]);
                }
                charList.add(chars[2 * i + 1]);
            } else {
                for (int j = 0; j < digit; j++) {
                    charList.add(chars[2 * i]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = charList.size() - 1; i >= 0; i--) {
            sb.append(charList.get(i));
        }
        return sb.toString();
    }
}
