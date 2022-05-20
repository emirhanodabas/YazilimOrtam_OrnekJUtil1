package tr.edu.medipol.islemler;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplaTest {

	private Hesapla fixture=new Hesapla();

	@Test
	public void testikiSayiTopla() {
		int sayi1=435;
		int sayi2=534;
		int beklenesonuc=969;
		
		int sonuc= fixture.topla(sayi1,sayi2);
		
		assertEquals(beklenesonuc,sonuc);
	}
	@Test
	public void testikiSayicikar() {
		int sayi1=520;
		int sayi2=108;
		int beklenesonuc=412;
		
		int sonuc= fixture.cikar(sayi1,sayi2);
		
		assertEquals(beklenesonuc,sonuc);
	}
	@Test
	public void testikiSayibol() {
		int sayi1=64;
		int sayi2=4;
		int beklenesonuc=16;
		
		int sonuc= fixture.bol(sayi1,sayi2);
		
		assertEquals(beklenesonuc,sonuc);
	}
	@Test
	public void testikiSayicarp() {
		int sayi1=12;
		int sayi2=4;
		int beklenesonuc=48;
		
		int sonuc= fixture.carp(sayi1,sayi2);
		
		assertEquals(beklenesonuc,sonuc);
	}
	@Test
	public void testdortSayiTopla() {
		int sayi1=435;
		int sayi2=534;
		int sayi3=1;
		int sayi4=2;
		int beklenesonuc=972;
		
		int sonuc= fixture.topla(sayi1,sayi2,sayi3,sayi4);
		
		assertEquals(beklenesonuc,sonuc);
	}
	@Test
	public void testdortSayiCikar() {
		int sayi1=2;
		int sayi2=1;
		int sayi3=234;
		int sayi4=500;
		int beklenesonuc=-737;
		
		int sonuc= fixture.cikar(sayi1,sayi2,sayi3,sayi4);
		
		assertEquals(beklenesonuc,sonuc);
	}

	@Test
	public void testdortSayiCarp() {
		int sayi1=5;
		int sayi2=4;
		int sayi3=3;
		int sayi4=2;
		int beklenesonuc=120;
		
		int sonuc= fixture.carp(sayi1,sayi2,sayi3,sayi4);
		
		assertEquals(beklenesonuc,sonuc);
	}

}
