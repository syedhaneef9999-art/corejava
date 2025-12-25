package net.konic.corejava.collections;

import java.util.LinkedList;

public class RemoveLastCustomer {

    
    public static LinkedList<String> removeLast() {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("C1");
        queue.add("C2");
        queue.add("C3");

        queue.removeLast();
        return queue;
    }


    public static void main(String[] args) {
        System.out.println("Queue After Removal: " + removeLast());
    }
}

