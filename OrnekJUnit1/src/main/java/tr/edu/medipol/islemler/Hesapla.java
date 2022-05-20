package tr.edu.medipol.islemler;

public class Hesapla {
	
	static int topla(int sayi1,int sayi2){
			
		return sayi1+sayi2;
	}
	static int cikar(int sayi1,int sayi2){
		
		return sayi1-sayi2;
	}
	static int bol(int sayi1,int sayi2){
		
		return sayi1/sayi2;
	}
	static int carp(int sayi1,int sayi2){
		
		return sayi1*sayi2;
	}
	static int topla(int ... sayilar){
		int toplamsonuc=0;
		for (int sayi : sayilar) {
			toplamsonuc +=sayi;
		}
		return toplamsonuc;
	}
	static int cikar(int ... sayilar){
		int cikansonuc=0;
		for (int sayi : sayilar) {
			cikansonuc =cikansonuc-sayi;
		}
		return cikansonuc;
	}
	static int carp(int ... sayilar){
		int carpilansonuc=1;
		for (int sayi : sayilar) {
			carpilansonuc =carpilansonuc*sayi;
		}
		return carpilansonuc;
	}
	public static void main(String[] args) {
		
		int sonuc=carp(12,4);
		System.out.println("243+654 = "+sonuc);
	
	}

}
