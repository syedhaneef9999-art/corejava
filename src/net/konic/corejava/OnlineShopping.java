package net.konic.corejava;

class OnlineShopping {

   
    void addToCart(int itemId) {
        System.out.println("Product " + itemId + " added to cart");
    }

    
    void addToCart(int itemId, int qty) {
        System.out.println("Product " + itemId + " added with quantity " + qty);
    }

    
    void addToCart(String itemName) {
        System.out.println(itemName + " added to cart");
    }

    public static void main(String[] args) {

        OnlineShopping shop = new OnlineShopping();

        shop.addToCart(101);
        shop.addToCart(101, 3);
        shop.addToCart("Earphones");
    }
}

