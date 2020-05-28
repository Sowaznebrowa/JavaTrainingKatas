package com.sowaznebrowa;

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
public class Dynatrace {

    public static void displayExample() {
        System.out.println(solution(new int[]{3, 1, 2, 4, 1, 6}));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int filteredSortedValues = Arrays.stream(A)
                .filter(value -> value > 0)
                .distinct()
                .sorted()
                .reduce((a, b) -> {
                    if (a != b-1) return a+1;
                    return b;
                }).orElse(1);

        return filteredSortedValues;



        /*for (int i = 1; i < filteredSortedValues.length; ++i) {
            if (filteredSortedValues[i - 1] != i) {
                return i;
            }
        }*/

    }
}
