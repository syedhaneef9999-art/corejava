package net.konic.corejava.collections;

import java.util.LinkedList;
import java.util.List;

public class ListWithoutGeneric {
public static void main(String[] args) {
	 List list = new LinkedList();

     list.add(1);      
     list.add("syed");   
     list.add(2.8);      
     list.add("syed");   
     list.add(null);    

     System.out.println("Data : " + list);
 

}

}
