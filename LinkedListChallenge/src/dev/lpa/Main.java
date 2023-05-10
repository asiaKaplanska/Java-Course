package dev.lpa;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    static boolean forward = true;
    public static void main(String[] args) {

        var itinerary = new LinkedList<Place>();

        addPlaces(itinerary);
        itinerary.sort(Comparator.comparingInt(Place::getDistance));

        var iterator = itinerary.listIterator();

        Scanner scanner = new Scanner(System.in);

        showMenu();

        while (true) {

            String input = scanner.nextLine();
            switch (input) {
                case "F", "Forward" -> printForward(iterator);
                case "B", "Backward" -> printBackward(iterator);
                case "L", "List Places" -> printPlaces(itinerary);
                case "M", "Menu" -> showMenu();
                case "Q", "Quit" -> {
                    return;
                }
                default -> {
                    System.out.println("Invalid input");
                }
            }
        }
    }

    private static void addPlaces(LinkedList<Place> list) {

        list.offer(new Place("Adelaide", 1374));
        list.offer(new Place("Alice Springs", 2771));
        list.offer(new Place("Brisbane", 917));
        list.offer(new Place("Darwin", 3972));
        list.offer(new Place("Melbourne", 877));
        list.offer(new Place("Perth", 3923));
        list.offerFirst(new Place("Sydney", 0));
    }

    private static void printPlaces(LinkedList<Place> list) {

        for (Place place : list) {
            System.out.println(place.toString());
        }
    }

    private static void showMenu() {

        System.out.println("Available actions (select word or letter): \n" +
                "(F)orward \n" +
                "(B)ackward \n" +
                "(L)ist Places \n" +
                "(M)enu \n" +
                "(Q)uit"
        );
    }

    private static void printForward(ListIterator<Place> iterator) {

        if (!forward) {           // Reversing Direction
            forward = true;
            if (iterator.hasNext()) {
                iterator.next();  // Adjust position forward
            }
        }

        if (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        } else {
            System.out.println("List ended!");
        }
    }

    private static void printBackward(ListIterator<Place> iterator) {

        if (forward) {           // Reversing Direction
            forward = false;
            if (iterator.hasPrevious()) {
                iterator.previous();  // Adjust position backwards
            }
        }
        if (iterator.hasPrevious()) {
            System.out.println(iterator.previous().toString());
        } else {
            System.out.println("List ended!");
        }
    }

}
