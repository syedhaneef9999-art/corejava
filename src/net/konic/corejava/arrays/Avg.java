package net.konic.corejava.arrays;

public class Avg {
	public static void main(String[] args) {
		int [] arr= {10,20,30,40};
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		int avg=sum/arr.length;
		System.out.println(avg);
	}
}
