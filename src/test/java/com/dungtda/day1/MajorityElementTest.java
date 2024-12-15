package com.dungtda.day1;

import org.junit.jupiter.api.Test;

class MajorityElementTest {

    private MajorityElement majorityElement = new MajorityElement();

    @Test
    void testMajorityElementWithMooreVotingAlgorithm() {
        int[] array = new int[]{1,2,3,4,3,2,2,1,2,2,2,2,2,3};


        assert majorityElement.majorityElementWithMooreVotingAlgorithm(array) == 2;
    }

}