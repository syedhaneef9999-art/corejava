package net.konic.corejava.collections;

import java.util.ArrayList;

public class UpdatePrice {
	public static ArrayList<Integer> updatePrice() {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(100);
        prices.add(200);
        prices.add(300);
        prices.add(400);

        prices.set(2, 250);
        return prices;
    }
	public static void main(String[] args) {
		System.out.println(updatePrice());
	}

}
