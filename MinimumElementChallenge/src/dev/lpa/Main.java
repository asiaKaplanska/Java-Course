package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Insert numbers: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] userArray = readIntegers(input);
        findMin(userArray);
        reverse(userArray);
    }


    public static int[] readIntegers(String input) {
        String[] stringsArray = input.split(",");
        int[] intsArray = new int[stringsArray.length];

        for (int i = 0; i < stringsArray.length; i++) {
            intsArray[i] = Integer.parseInt(stringsArray[i]);
        }
        System.out.println(Arrays.toString(intsArray));
        return intsArray;
    }

    public static int findMin(int[] inputArray) {

        Arrays.sort(inputArray);
        System.out.println("Minimum value found in your array: " + inputArray[0]);
        return inputArray[0];
    }

    public static void reverse(int[] inputArray) {

        int arrayLength = inputArray.length;
        int[] reverseArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            reverseArray[i] = inputArray[arrayLength - 1 - i];
        }
        inputArray = reverseArray;
        System.out.println("Reverse array : " + Arrays.toString(inputArray));
    }
}
