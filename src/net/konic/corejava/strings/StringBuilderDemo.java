package net.konic.corejava.strings;

public class StringBuilderDemo {
	public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Syed");

        System.out.println("Before append: " + name);
        System.out.println("Hashcode: " + name.hashCode());

        name.append(" Haneef");

        System.out.println("After append: " + name);
        System.out.println("Hashcode: " + name.hashCode());
    }

}
