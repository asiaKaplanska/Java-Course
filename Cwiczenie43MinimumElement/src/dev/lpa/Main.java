package dev.lpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // System.out.println(Arrays.toString(readElements(5)));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements you need to enter: ");
        String inputNumberElements = scanner.nextLine();
        return Integer.parseInt(inputNumberElements);
    }

    private static int[] readElements(int elements) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements: ");
        int[] enteredIntegers = new int[elements];
        for (var i = 0; i < elements; i++) {
            enteredIntegers[i] = Integer.parseInt(scanner.nextLine());
        }

        return enteredIntegers;
    }

    private static int findMin(int[] arrayOfIntegers) {
        int minimumValue = Integer.MAX_VALUE;
        for (var element : arrayOfIntegers) {
            if (element < minimumValue) {
                minimumValue = element;
            }
        }
        return minimumValue;
    }
}
