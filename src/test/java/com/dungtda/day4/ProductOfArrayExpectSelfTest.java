package com.dungtda.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExpectSelfTest {

    @Test
    void test() {
        int[] nums = {1, 2, 3, 4};

        int[] products = ProductOfArrayExpectSelf.solution(nums);
        for (int product : products) {
            System.out.println(product);
        }
    }
}