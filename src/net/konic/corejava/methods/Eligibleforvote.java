package net.konic.corejava.methods;

public class Eligibleforvote {
	boolean age(int age) {
		if(age>=18)
		{
			System.out.println("YOU ARE ELIGIBLE");
			return true;
		}
		else 
		{
			System.out.println("YOU ARE NOT ELIGIBLE");
			return false;
		}
	}

	public static void main(String[] args) {
		Eligibleforvote efv = new Eligibleforvote();
		efv.age(17);

	}

}
