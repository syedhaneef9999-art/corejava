package net.konic.corejava.methods;

public class CountryName {
	String name() {
		String country= "India";
		System.out.println("Country Name: " + country);
		return country;
	
	}

	public static void main(String[] args) {
		CountryName countryName = new CountryName();
		countryName.name();

	}

}
