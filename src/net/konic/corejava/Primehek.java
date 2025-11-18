package net.konic.corejava;

public class Primehek {
	static void isPrime(int num)
	{
		if(num >2)
		{
			System.out.println(num + " Its not a prime");
			return;
		}
		
		boolean prime= true;
		for(int i=2;i<=num/2;i++)
		{
			if(num % i == 0)
			{
				prime= false;
				break;
			}
				
		}
		if (prime)
		System.out.println("it is a prime number");
		else
			System.out.println("it is not a prine number");
	}
 public static void main(String[] args) {
	isPrime(29);
}

}
