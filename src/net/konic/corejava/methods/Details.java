package net.konic.corejava.methods;
class Mobile {
    String brand;
    int ram;

    void call() {
        System.out.println("Mobile is calling...");
    }

    void showDetails() {
        System.out.println("Mobile Brand : " + brand);
        System.out.println("Mobile RAM   : " + ram + "GB");
    }
}

class Laptop {
    String brand;
    int ram;

    Mobile mobile;    // Laptop HAS a Mobile

    void start() {
        System.out.println("Laptop is starting...");
    }

    void showDetails() {
        System.out.println("Laptop Brand : " + brand);
        System.out.println("Laptop RAM   : " + ram + "GB");
    }
}

class Details {
    public static void main(String[] args) {

        Mobile m = new Mobile();
        m.brand = "Samsung";
        m.ram = 8;

        Laptop l = new Laptop();
        l.brand = "HP";
        l.ram = 16;

        l.mobile = m;   // connect mobile to laptop

        // Showing all details
        m.showDetails();
        System.out.println("------------------------");
        l.showDetails();
        System.out.println("------------------------");

        m.call();
        l.start();
        l.mobile.call();
    }
}
