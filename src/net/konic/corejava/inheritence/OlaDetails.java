package net.konic.corejava.inheritence;

class Ola {
    void ride() {
        System.out.println("Basic Ride Started");
    }
}

class OlaMini extends Ola {
    void miniFeatures() {
        System.out.println("Mini: AC + Comfortable seats");
    }
}

class OlaPrime extends Ola {
    void primeFeatures() {
        System.out.println("Prime: Luxury seats + Extra comfort");
    }
}

public class OlaDetails {
    public static void main(String[] args) {

        OlaMini mini = new OlaMini();
        mini.ride();
        mini.miniFeatures();
       
        OlaPrime prime = new OlaPrime();
        prime.ride();
        prime.primeFeatures();
    }
}

