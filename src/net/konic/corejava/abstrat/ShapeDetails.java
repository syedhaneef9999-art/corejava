package net.konic.corejava.abstrat;

import java.util.Scanner;

abstract class Shape{
	abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}


public class ShapeDetails {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter shape (circle/square): ");
		String shapeName = sc.nextLine().toLowerCase();

        Shape shape = null;

        switch (shapeName.toLowerCase()) {
        case "circle":
            shape = new Circle();
            break;

        case "square":
            shape = new Square();
            break;

        default:
            System.out.println("Invalid Shape");
            sc.close();
            return;
    }
        shape.draw();   // runtime polymorphism

        sc.close();
    }
}
