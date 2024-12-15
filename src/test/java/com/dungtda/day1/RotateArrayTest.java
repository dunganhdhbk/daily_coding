package com.dungtda.day1;

import org.junit.jupiter.api.Test;

class RotateArrayTest {


    @Test
    void testRotate() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        RotateArray.rotate(array, k);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    void testRotate2() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        RotateArray.rotate2(array, k);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    void testRotate3() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        RotateArray.rotate3(array, k);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}