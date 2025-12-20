package net.konic.corejava.arrays;

public class EvenOddCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
        int even = 0, odd = 0;

        for (int n : arr) {
            if (n % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println(even);
        System.out.println(odd);

	}

}
