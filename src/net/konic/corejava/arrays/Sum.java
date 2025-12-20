package net.konic.corejava.arrays;

public class Sum {
	public static void main(String[] args) {
		int [] arr= {10,20,30,40};
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
