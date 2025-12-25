package net.konic.corejava.collections;

import java.util.LinkedList;

public class CheckQueueSize {

    
    public static int getQueueSize() {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("C1");
        queue.add("C2");
        return queue.size();
    }

  
    public static void main(String[] args) {
        System.out.println("Total Customers: " + getQueueSize());
    }
}

