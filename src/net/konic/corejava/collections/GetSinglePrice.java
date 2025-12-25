package net.konic.corejava.collections;

import java.util.ArrayList;

public class GetSinglePrice {
	public static int getPriceByindex(int index) {
		ArrayList<Integer> prices =new ArrayList<>();
		prices.add(100);
		prices.add(200);
		prices.add(300);
		prices.add(400);
		return prices.get(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=2;
		System.out.println("price at index " + index + " : " + getPriceByindex(index));

	}

}
