package net.konic.corejava.strings;

public class StringImmutability {
	public static void main(String[] args) {

        String msg = "Hello";
        msg.concat(" World");

        System.out.println(msg);   

        msg = msg.concat(" World");
        System.out.println(msg);   
    }

}
