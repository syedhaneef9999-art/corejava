package net.konic.corejava.inheritence;

class Parent{
  Parent(){
	 System.out.println("parent constructor");	 
 }
}
class Child extends Parent{
	 Child() {
		System.out.println("child constructor");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		new Child();

	}

}
