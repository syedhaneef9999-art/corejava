package net.konic.corejava.collections;


import java.util.ArrayList;

public class ProductArrayList {

    // Q5. Create Product List
    public static ArrayList<Integer> createProductList() {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(100);
        prices.add(200);
        prices.add(300);
        prices.add(400);
        return prices;
    }

    // Q6. Retrieve Product Price by Index
    public static int getPriceByIndex(int index) {
        ArrayList<Integer> prices = createProductList();
        return prices.get(index);
    }

    // Q7. Insert Price in Middle (index 1)
    public static ArrayList<Integer> insertPriceInMiddle() {
        ArrayList<Integer> prices = createProductList();
        prices.add(1, 150);
        return prices;
    }

    // Q8. Update Price at index 2
    public static ArrayList<Integer> updatePrice() {
        ArrayList<Integer> prices = insertPriceInMiddle();
        prices.set(2, 250);
        return prices;
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("Prices: " + createProductList());

        System.out.println("Price at index 3: " + getPriceByIndex(3));

        System.out.println("Updated Prices: " + insertPriceInMiddle());

        System.out.println("After Update: " + updatePrice());
    }
}

