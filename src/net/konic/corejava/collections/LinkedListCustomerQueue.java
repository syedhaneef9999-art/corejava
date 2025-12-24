package net.konic.corejava.collections;

import java.util.LinkedList;

public class LinkedListCustomerQueue {

    // Q9. Create Customer Queue
    public static LinkedList<String> createCustomerQueue() {

        LinkedList<String> queue = new LinkedList<>();

        queue.add("C1");
        queue.add("C2");
        queue.add("C3");

        return queue;
    }

    // Q10. Add VIP Customer at Beginning
    public static LinkedList<String> addVipCustomer() {

        LinkedList<String> queue = createCustomerQueue();
        queue.addFirst("VIP");
        return queue;
    }

    // Q11. Serve Customer (Remove First)
    public static String serveCustomer(LinkedList<String> queue) {

        return queue.removeFirst();
    }

    // Q12. Remove Last Customer
    public static void removeLastCustomer(LinkedList<String> queue) {

        queue.removeLast();
    }

    // Q13. Check Queue Size
    public static int getQueueSize(LinkedList<String> queue) {

        return queue.size();
    }

    // Main Method
    public static void main(String[] args) {

        // Q9
        LinkedList<String> queue = createCustomerQueue();
        System.out.println("Queue: " + queue);

        // Q10
        queue = addVipCustomer();
        System.out.println("Queue After VIP: " + queue);

        // Q11
        String served = serveCustomer(queue);
        System.out.println("Served Customer: " + served);
        System.out.println("Remaining Queue: " + queue);

        // Q12
        removeLastCustomer(queue);
        System.out.println("Queue After Removal: " + queue);

        // Q13
        int total = getQueueSize(queue);
        System.out.println("Total Customers: " + total);
    }
}

