package net.konic.corejava.methods;
//method with parameters& without return type
public class Calculator3 {
	void sum(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Calculator3 cal=new Calculator3();
		cal.sum(7, 5);
		
	}
	
}
