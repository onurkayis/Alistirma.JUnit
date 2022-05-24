package tr.edu.medipol.yazilim.islemler;

public class Hesaplama {

	static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	static int cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
	
	static int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	static int bol(int sayi1, int sayi2) {
		return sayi1 / sayi2;
	}
	
	public static void main(String[] args) {
		
		System.out.println(topla(243,654));
		
		
	}

}
