package net.konic.corejava.strings;

public class StringBuilderMethods {
	public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" World");
        System.out.println(sb);

        sb.insert(4, " SE");
        System.out.println(sb);

        sb.replace(0, 4, "Core");
        System.out.println(sb);

        sb.delete(4, 7);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        
System.out.println("String buffer starts --------------");
                StringBuffer sb1 = new StringBuffer("Java");

                sb1.append(" World");
                System.out.println(sb1);

                sb1.insert(4, " SE");
                System.out.println(sb1);

                sb1.replace(0, 4, "Core");
                System.out.println(sb1);

                sb1.delete(4, 7);
                System.out.println(sb1);

                sb1.reverse();
                System.out.println(sb1);


    }
}
