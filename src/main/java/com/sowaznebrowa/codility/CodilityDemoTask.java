package com.sowaznebrowa.codility;

import java.util.Arrays;

/*This is a demo task.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].*/
public class CodilityDemoTask {

    public static void displayExample() {
        System.out.println(solution(new int[]{5}));
    }

    private static int solution(int[] A) {
        // write your code in Java SE 8
        int[] filteredSortedValues = Arrays.stream(A)
                .filter(value -> value > 0)
                .sorted()
                .toArray();

        if (filteredSortedValues.length == 0){
            return 1;
        }

        int j = 0;
        for (int i = 0; i < filteredSortedValues.length; ++i) {
            if (filteredSortedValues[i] != i-1) {
                return i;
            }
        }

        if (filteredSortedValues.length == A.length){
            return filteredSortedValues.length + 1;
        }

        return filteredSortedValues.length;

    }
}
