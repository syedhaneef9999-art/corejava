package net.konic.corejava.inheritence;

class Shop{
	void shop() {
		System.out.println("This is a shop");
	}
}
class GroceryShop extends Shop{
	void groceryshop() {
		System.out.println("This is a Grocery shop");
	}
}
class OnlineGrocery extends GroceryShop{
	void onlinegrocery() {
		System.out.println("This is a OnlineGrocery");
	}
}
public class ShopDetail {

	public static void main(String[] args) {
		OnlineGrocery og=new OnlineGrocery();
		og.shop();
		og.groceryshop();
		og.onlinegrocery();

	}

}
