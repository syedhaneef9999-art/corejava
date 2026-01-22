package net.konic.corejava.thread;

public class NumberRunnable implements Runnable {

    public void run() {

        for(int i = 1; i <= 10; i++) {

            System.out.println(i);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        NumberRunnable r = new NumberRunnable();

        Thread t = new Thread(r);

        t.start();
    }
}

