package net.konic.corejava.accessmodifier;

public class Library {
	static String libraryName="Aira";
	
	String membername;
	 Library() {
		membername="Guest Member";
	}
	 Library(String name){
		 membername=name;
	 }
	 
	 void selectBook(int id) {
		 String book="";
		 switch(id) {
		 case 1:
			 book="telugu";
			 break;
		 case 2:
			 book="Hindi";
			 break;
		 case 3:
			 book="Maths";
			 break;
			 default:
				 System.out.println("invalid book");
			 return;
		 }
		// System.out.println("Library :"+libraryName);
		 System.out.println("memeber name :"+membername);
		 System.out.println("book :"+ book);
		 
	 }
	 
	 public static void main(String[] args) {
		System.out.println(Library.libraryName);
		Library l= new Library("haneef");
		l.selectBook(3);
		//Library guest =new Library();
		//guest.selectBook(1);
	}

}
