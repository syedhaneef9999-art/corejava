package net.konic.corejava.inheritence;
class Mobile{
	void common(){
		System.out.println("Common mobile feature");
	}
}
class Samsung extends Mobile{
	void samsungfeature() {
		System.out.println("Samsung special feature");
	}
	
}
class Iphone extends Mobile{
	void Iphonefeature() {
		System.out.println("Iphone special feature");
	}
	
}

public class MobileMain {
	public static void main(String[] args) {
		Iphone i =new Iphone();
		i.Iphonefeature();
		i.common();
		Samsung s= new Samsung();
		s.common();
		s.samsungfeature();
	}

}
