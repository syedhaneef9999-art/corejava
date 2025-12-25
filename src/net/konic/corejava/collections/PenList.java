package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;


public class PenList{

    List<Pen> addPenDetails() {

        Pen p = new Pen();
        p.setBrandName("Apsara");
        p.setColor("Red");
        p.setPrice(20);

        Pen p1 = new Pen();
        p1.setBrandName("Nataraj");
        p1.setColor("Black");
        p1.setPrice(15);

        Pen p2 = new Pen();
        p2.setBrandName("Cello");
        p2.setColor("Blue");
        p2.setPrice(18);

        
        List<Pen> list = new ArrayList<>();
        list.add(p);
        list.add(p1);
        list.add(p2);

        return list;
    }

    public static void main(String[] args) {

        PenList lp = new PenList();
        List<Pen> l = lp.addPenDetails();

        System.out.println("List Of Pen Details : " + l);
    }
}
