package net.konic.corejava.staticnonstatic;

public class CounterDemo {
	static int count = 0;

    CounterDemo() {
        count++;   // increases when object created
    }

    public static void main(String[] args) {

    	CounterDemo d1= new CounterDemo();
    	CounterDemo d2=new CounterDemo();
    	CounterDemo d3=new CounterDemo();
    	

        System.out.println("Total Objects: " + CounterDemo.count);
    }

}
