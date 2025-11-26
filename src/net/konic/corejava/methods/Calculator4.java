package net.konic.corejava.methods;
//method with return type without parameters
public class Calculator4 {
	
	int multiply() {
	int a= 6;
	int b=5;
	int c=a*b;
	
	return c;
	}	
	
	public static void main(String[] args) {
		Calculator4 cal= new Calculator4();
		cal.multiply();
		
		
	}
	

}
