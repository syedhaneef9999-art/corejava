package net.konic.corejava.variable;

import java.util.Scanner;

/*7️) Temperature Converter

Local variable for input

Instance variable to store Celsius

Method toFahrenheit() → returns converted value

Print in main.
*/

public class TempChek {
	double celsius;
	
	void readTemperature() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        celsius  = sc.nextDouble();
        sc.close();
    }
	double toFahrenheit() {
		 return (celsius * 9 / 5) + 32;
	}
	
	public static void main(String[] args) {
		TempChek tc=new TempChek();
		tc.readTemperature();
		double result= tc.toFahrenheit();
		System.out.println(result);

	}

}
