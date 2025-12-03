package net.konic.corejava.constructor;

public class ProductBilling {
	String name;
	int price;
	
	ProductBilling()
	{
		name="unknown";
		price=0;
	}

	ProductBilling(String n, int p){
		name=n;
		price=p;
		
	}
	public static void main(String[] args) {
		ProductBilling pb=new ProductBilling("Phone",20000);
		System.out.println("Product :"+ pb.name);
		System.out.println("price :" +pb.price);
		
		ProductBilling pb2=new ProductBilling();
		System.out.println("Product : " + pb2.name);
        System.out.println("Price : " + pb2.price);

	}

}
