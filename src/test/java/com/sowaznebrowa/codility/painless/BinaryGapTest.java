package com.sowaznebrowa.codility.painless;

import org.junit.jupiter.api.Test;

class BinaryGapTest {

    @Test
    void testSolutions() {
        assert BinaryGap.solution(1041) == 5; // 10000010001
        assert BinaryGap.solution(272) == 3; // ‭100010000‬
        assert BinaryGap.solution(2147483647) == 0; //‭111 1111 1111 1111 1111 1111 1111 1111‬
    }
}