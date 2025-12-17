package net.konic.corejava.strings;

//Basic String Operations
public class StringBasic {
    public static void main(String[] args) {

        String name = "Konic";

        System.out.println("Original String: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Char at index 1: " + name.charAt(1));
        System.out.println("Contains 'on': " + name.contains("on"));
    }
}
