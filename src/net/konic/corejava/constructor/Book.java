package net.konic.corejava.constructor;

public class Book {
	
	String title;
	String Author;
	
	Book(String t,String a){
		title=t;
		Author=a;
	}
	Book(Book b){
		title=b.title;
		Author=b.Author;
	}

	public static void main(String[] args) {
		Book b1=new Book("java","James");
		System.out.println(b1.title+" "+b1.Author);
		Book b2=new Book(b1);
		System.out.println(b2.title + " " + b2.Author);
		

	}

}
