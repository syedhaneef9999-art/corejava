package net.konic.corejava.collections;

import java.util.LinkedList;

public class ServeCustomer {

    // Method first
    public static void serveCustomer() {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("VIP");
        queue.add("C1");
        queue.add("C2");
        queue.add("C3");

        String served = queue.removeFirst();

        System.out.println("Served Customer: " + served);
        System.out.println("Remaining Queue: " + queue);
    }

   
    public static void main(String[] args) {
        serveCustomer();
    }
}
