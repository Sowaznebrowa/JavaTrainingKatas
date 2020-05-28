package com.sowaznebrowa.string.processing;

import org.junit.jupiter.api.Test;

import java.util.*;

class ProcessStringToOrderedMapTest {

    @Test
    void getResult() {
        //given
        Map<Character, List<String>> expectedMap = Map.of(
                'a', List.of("aword","anotherword"),
                'b', List.of("bword"),
                'd', List.of("dword"),
                'o', List.of("Osomeword"),
                'z', List.of("zword")
        );
        assert ProcessStringToOrderedMap.getResult("zword;aword;bword;dword;anotherword;Osomeword;;").equals(expectedMap);
    }
}
