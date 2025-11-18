package net.konic.corejava;

public class Square {

    static void square(int n) {
        System.out.println("Square of " + n + " is " + (n * n));
    }

    public static void main(String[] args) {
        square(7); 
        
       /* public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            square(num);
            sc.close();*/
    }
}
