package net.konic.corejava.collections;

import java.util.LinkedList;

public class AddVipCustomer {

    // Method first
    public static LinkedList<String> addVip() {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("C1");
        queue.add("C2");
        queue.add("C3");

        queue.addFirst("VIP");
        return queue;
    }

    
    public static void main(String[] args) {
        System.out.println("Queue After VIP: " + addVip());
    }
}
