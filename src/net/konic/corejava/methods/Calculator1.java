package net.konic.corejava.methods;
//method without parameter without no return type
public class Calculator1 {
	
	void add()
	{
		int a=20;int b=30;
		int c= a+b;
		System.out.println(c);
	}
	void subtract()
	{
		int a=30; int b=10;
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator1 cal= new Calculator1();
		cal.add( );
		cal.subtract();
	}
}
