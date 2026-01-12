package net.konic.corejava.exceptions;

import java.io.FileInputStream;

public class TryWithResources {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt")) {
            System.out.println("Reading file");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

