package com.dungtda.day7;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int maxArea = 0;

        while (start < end) {
            maxArea = Math.max(maxArea, calculateWater(height, start, end));
            if (height[start] < height[end]) start++;
            else end--;
        }
        return maxArea;
    }

    public static int calculateWater(int[] height, int start, int end) {
        if (start > end) return 0;
        int x = end - start;
        int y = Math.min(height[start], height[end]);
        return x * y;
    }
}
