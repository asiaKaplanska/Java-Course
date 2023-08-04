package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer[] randomArray = getRandomArray(7);
        System.out.println(Arrays.toString(randomArray));

        Arrays.sort(randomArray, Comparator.reverseOrder());
        System.out.println(Arrays.toString(randomArray));

//        int[] reverseRandomArray = new int[7];
//
//        for (int i = 0; i < reverseRandomArray.length; i++) {
//            reverseRandomArray[i] = randomArray[reverseRandomArray.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(reverseRandomArray));
    }

    private static Integer[] getRandomArray (int arrayLength) {

        var random = new Random();
        var newInt = new Integer[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}


