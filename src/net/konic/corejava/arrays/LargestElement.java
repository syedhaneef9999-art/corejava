package net.konic.corejava.arrays;

public class LargestElement {

	public static void main(String[] args) {
		 int[] arr = {45, 22, 89, 10};
		 int largest = arr[0];
		 for (int num : arr) {
			if(num > largest)
			{
				largest=num;
			}
			
		 }
		 System.out.println(largest);

	}

}
