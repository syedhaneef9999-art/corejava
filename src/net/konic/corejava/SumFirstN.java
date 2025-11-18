package net.konic.corejava;

public class SumFirstN {
	
static void sumoffirstnumber (int n)
{
	int sum=0;
	for (int i=0;i<=n;i++)
			{
				sum +=i;
			}
	System.out.println("sum of first "+ n + " numbers: " +sum);
}

public static void main(String[] args) {
	sumoffirstnumber(3);
}
}

/*import java.util.Scanner;

class SumFirstN {
    static void sumOfFirstNNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum of first " + n + " numbers: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        sumOfFirstNNumbers(n);
        sc.close();
    }
}*/

