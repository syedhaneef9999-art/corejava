package net.konic.corejava.strings;

public class StringLiteralVsNew {
	public static void main(String[] args) {

        String x = "Room";
        String y = "Room";
        String z = new String("Room");

        System.out.println(x == y);        
        System.out.println(x == z);        
        System.out.println(x.equals(z));
	}
}
