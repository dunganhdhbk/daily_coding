package com.dungtda.day4;

public class ProductOfArrayExpectSelf {

    public static int[] solution(int[] nums) {
        int[] prefixProducts = new int[nums.length];
        int[] suffixProducts = new int[nums.length];

        prefixProducts[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProducts[i] = nums[i - 1] * prefixProducts[i - 1];
        }
        suffixProducts[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixProducts[i] = nums[i + 1] * suffixProducts[i + 1];
        }

        int[] products = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            products[i] = prefixProducts[i] * suffixProducts[i];
        }
        return products;
    }
}
