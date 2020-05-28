package com.sowaznebrowa.codility.painless;

public class BinaryGap {

    public static void displayExample() {
        System.out.println(solution(1041)); // 10000010001
    }

    static int solution(int N) {

        String binaryString = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;

        for (int i = 1; i < binaryString.length(); i++) {
            char previousChar = binaryString.charAt(i - 1);
            char currentChar = binaryString.charAt(i);
            if (previousChar == '1' && currentChar == '0') {
                currentGap = 1;
            }
            if (previousChar == '0' && currentChar == '1') {
                if (maxGap < currentGap) {
                    maxGap = currentGap;
                }
                currentGap = 0;
            }
            if (previousChar == '0' && currentChar == '0') {
                currentGap++;
            }
        }
        return maxGap;

    }

}
