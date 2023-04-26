package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner userGroceryAddings = new Scanner(System.in);
            Scanner userGroceryRemoval = new Scanner(System.in);

            System.out.println("Available actions:\n" +
                    "0 - to shutdown\n" +
                    "1 - to add item(s) to list (comma delimited list)\n" +
                    "2 - to remove any items (comma delimited list)\n" +
                    "Enter a number for which action you want to do:");

            String input = scanner.nextLine();
            switch (input) {
                case "0" -> {
                    System.out.println(groceryList);
                    groceryList.clear();
                    return;
                }
                case "1" -> {
                    System.out.print("Adding to grocery list: ");
                    String[] groceryAddings = userGroceryAddings.nextLine().split(",");

                    for (String item : groceryAddings) {

                        if (!item.matches("^[a-zA-Z]+$")) {
                            System.out.println("Insert only letters!");
                            continue;
                        }
                        if (groceryList.contains(item)){
                            System.out.println(item + " is already exist at list!");
                        } else {
                        groceryList.add(item);}
                    }
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);
                }
                case "2" -> {
                    System.out.print("Item(s) to remove: ");
                    String[] groceryRemoval = userGroceryRemoval.nextLine().split(",");
                    groceryList.removeAll(Arrays.asList(groceryRemoval));
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);
                }
                default -> System.out.println("Invalid input, try again...");
            }
        }
    }
}
