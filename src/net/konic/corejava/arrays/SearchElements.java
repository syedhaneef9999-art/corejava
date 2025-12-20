package net.konic.corejava.arrays;

public class SearchElements {
	public static void main(String[] args) {
		
		int a[]= {5,10,15,20};
		int search=15;
		int count=0;
		for(int num : a)
		{
			if(num==search) {
				count++;
			break;
			}
		}
		if (count > 0)
			System.out.println("element found");
		
		else 
			System.out.println("not found");
		
		
	}

}
