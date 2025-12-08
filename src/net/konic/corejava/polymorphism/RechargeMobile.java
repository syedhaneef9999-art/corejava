package net.konic.corejava.polymorphism;

public class RechargeMobile {
	void recharge(long num) {
		System.out.println("recharge successfull for " + num);
		
	}
void recharge(long num, int plan) {
		System.out.println("recharge "+plan +" successful");
	}
void recharge(long num,int plan, String coupen) {
	System.out.println("recharge "+plan +" with coupon " +coupen+ " applied");
	
}

	public static void main(String[] args) {
		RechargeMobile rm= new RechargeMobile();
		rm.recharge(9627287290L);
		rm.recharge(9876621027L, 299);
		rm.recharge(9861573937L, 299, "New50");
		

	}

}
