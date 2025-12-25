package net.konic.corejava.collections;

import java.util.ArrayList;

public class insertPriceinmiddle {
	public static ArrayList<Integer>insertprice(){
		ArrayList<Integer> prices =new ArrayList<>();
		prices.add(100);
		prices.add(200);
		prices.add(300);
		prices.add(400);
		prices.add(1,150);
		
		return prices;
	}
	public static void main(String[] args) {
		System.out.println(insertprice());
		
	}
}
