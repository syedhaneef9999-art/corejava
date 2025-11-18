package net.konic.corejava;

public class CheckEven {
	
	static void isEven(int n) 
	{
		if(n% 2==0) 
		{
		
			System.out.println("it is a even number");
			}
			
			else 
			
			{
				System.out.println("odd number");
			
			}
			
		
	}

	public static void main(String[] args) {
		isEven(8);
	}
}


/*
import java.util.Scanner;

class CheckEven {
    static void isEven(int num) {
        if (num % 2 == 0) System.out.println(num + " is Even");
        else System.out.println(num + " is Odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        isEven(num);
        sc.close();
    }
}
*/