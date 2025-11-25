package net.konic.corejava.classobjectexamples;

class AC
{
	String brand;
	String color;
	int size;
	double Dimensions;
	
	//methods
	void cool(){
		
		System.out.println("it is too cool");

	}
	
}

public class Test3 {

	public static void main(String[] args) {
		// objet
		AC ac=new AC();
		ac.brand="LG";
		ac.color="White";
		ac.size= 12;
		ac.Dimensions= 12 * 12;
		ac.cool();
		
		

	}

}
