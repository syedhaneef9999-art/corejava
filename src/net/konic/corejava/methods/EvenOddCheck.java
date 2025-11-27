package net.konic.corejava.methods;

public class EvenOddCheck {
		boolean Number(int num) {
			if(num%2==0)
			{
				System.out.println("Even");
				return true;
			}
			else 
			{
				System.out.println("odd");
				return false;
			}
		}

		public static void main(String[] args) {
			EvenOddCheck eov = new EvenOddCheck();
			eov.Number(17);

		}

	}
