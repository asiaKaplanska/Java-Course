package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        reverse(new int[]{1,2,3,4,5});
    }

    private static void reverse(int[] inputArray) {
        int[] reversedArray = Arrays.copyOf(inputArray, inputArray.length);
        int halfLength = reversedArray.length / 2;
        int maxIndex = reversedArray.length - 1;
        for(var i = 0; i < halfLength; i++) {
            int temp = reversedArray[i];
            reversedArray[i] = reversedArray[maxIndex - i];
            reversedArray[maxIndex - i] = temp;
        }

        System.out.println("Array = " + Arrays.toString(inputArray));
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }
}
