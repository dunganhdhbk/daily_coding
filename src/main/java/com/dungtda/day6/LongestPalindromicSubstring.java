package com.dungtda.day6;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abba"));
    }

    public static String longestPalindrome(String s) {
        String maxString = "";

        for (int i = 0; i < s.length(); i++) {
            String maxOdd = expandFromCenter(s, i, i);
            String maxEven = expandFromCenter(s, i, i + 1);
            if (maxEven.length() > maxString.length()) {
                maxString = maxEven;
            }
            if (maxOdd.length() > maxString.length()) {
                maxString = maxOdd;
            }
        }
        return maxString;
    }

    public static String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
