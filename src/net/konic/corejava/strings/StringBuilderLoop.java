package net.konic.corejava.strings;

public class StringBuilderLoop {
	public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("A");
        System.out.println("Before loop: " + sb);

        for (int i = 1; i <= 3; i++) {
            sb.append(i);
            System.out.println("Value: " + sb);
        }
    }
}
