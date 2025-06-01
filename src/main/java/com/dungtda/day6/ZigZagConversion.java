package com.dungtda.day6;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

    public static void main(String[] args) {
    }

    public static String convert(String s, int numRows) {
        if (s == null || s.length() == 1 || numRows == 1) return s;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        int index = 0;
        int d = 1;
        for (int i = 0; i < s.length(); i++) {
            rows[index].add(s.charAt(i));
            if (index == 0) {
                d = 1;
            } else if (index == numRows - 1) {
                d = -1;
            }
            index += d;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < rows[i].size(); j++) {
                sb.append(rows[i].get(j));
            }
        }
        return sb.toString();
    }
}
