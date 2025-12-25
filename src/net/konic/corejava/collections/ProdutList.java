package net.konic.corejava.collections;

import java.util.ArrayList;

public class ProdutList {
	public static ArrayList<Integer>createProductList(){
		ArrayList<Integer> prices =new ArrayList<>();
		prices.add(100);
		prices.add(200);
		prices.add(300);
		prices.add(400);
		return prices;
		
		
	}
	public static void main(String[] args) {
		System.out.println("product prices :" +createProductList());
	}

}
