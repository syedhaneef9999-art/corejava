package net.konic.corejava.threads;

class MyThread extends Thread {
	 public void run() {
	  System.out.println("Thread is running");

	  try {
	   Thread.sleep(5000);
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }

	  System.out.println("After 5 seconds");
	 }

	 public static void main(String[] args) {
	  MyThread t = new MyThread();

	  System.out.println(t.getState());   
	  t.start();                         
	  System.out.println(t.getState());  
	 }
	}

