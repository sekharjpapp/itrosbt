package datastructures;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        // Creating object of class linked list
        LinkedList<String> object = new LinkedList<>();
        // Adding elements to the linked list
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");
        System.out.println("Linked list : " + object);
    }
}
