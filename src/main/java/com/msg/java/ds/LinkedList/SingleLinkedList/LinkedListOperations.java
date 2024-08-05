package com.msg.java.ds.LinkedList.SingleLinkedList;

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String [] args){
        LinkedList<String> fruits = new LinkedList<>();

        //1. Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Papaya");

        // 2. Get an element by index
        String firstElement = fruits.get(0);
        System.out.println("First fruit: " + firstElement);

        // 3. Remove an element by index
        fruits.remove(1); // Removes "Banana"
        System.out.println("LinkedList after removing 'Banana': " + fruits);

        // 4. Check if an element exists
        boolean containsApple = fruits.contains("Apple");
        System.out.println("LinkedList contains 'Apple': " + containsApple);

        // 5. Get the size of the LinkedList
        int size = fruits.size();
        System.out.println("Size of the LinkedList: " + size);

        // 6. Iterate through the LinkedList
        System.out.print("Iterating through the LinkedList: ");
        for (String element : fruits) {
            System.out.print(element + " ");
        }

        // 7. Clear the LinkedList
        fruits.clear();
        System.out.println("LinkedList after clearing: " + fruits);
    }
}
