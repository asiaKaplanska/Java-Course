package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    public static int[] getIntegers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int[] customizedArray = new int[arraySize];
        String[] splitInput = userInput.split(" ");
        for (int i = 0; i < arraySize; i++) {
            customizedArray[i] = Integer.parseInt(splitInput[i]);
        }
        return customizedArray;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(sortedArray);
        for(int i = 0; i < sortedArray.length / 2; i++) {
            int j = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - i - 1];
            sortedArray[sortedArray.length - i - 1] = j;
        }

        return sortedArray;
    }
}
