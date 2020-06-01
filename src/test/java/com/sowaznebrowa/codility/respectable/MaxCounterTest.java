package com.sowaznebrowa.codility.respectable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaxCounterTest {

    @Test
    void solutionTest() {
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4,};
        int[] expectedResult = new int[]{3, 2, 2, 4, 2};
        assertArrayEquals(expectedResult, MaxCounter.solution(5, A));
    }
}