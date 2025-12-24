package net.konic.corejava.collections;

import java.util.*;

public class ArrayListAllOperations {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // ADD
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("After Add : " + list);

        // INSERT (shifting happens)
        list.add(1, 99);
        System.out.println("After Insert : " + list);

        // GET (fast)
        int value = list.get(2);
        System.out.println("Get element at index 2 : " + value);

        // UPDATE
        list.set(2, 100);
        System.out.println("After Update : " + list);

        // REMOVE (shifting happens)
        list.remove(2);
        System.out.println("After Remove : " + list);

        // SIZE
        System.out.println("Size : " + list.size());
    }
}
