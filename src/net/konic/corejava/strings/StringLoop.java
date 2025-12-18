package net.konic.corejava.strings;

public class StringLoop {
	public static void main(String[] args) {

        String s = "A";
        System.out.println("Before loop: " + s);

        for (int i = 1; i <= 3; i++) {
            s = s + i;
            System.out.println("Value: " + s);
        }
    }
}
