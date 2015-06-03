package Laporan5;

public class Tumbuhan2 {
	private String namaSpesies;
	private int lebarDaun;
	private int panjangBatang;
	
	private Tumbuhan2() {
		namaSpesies="Pinus";
		lebarDaun=40;
		panjangBatang=90;
	}
	
	private Tumbuhan2(String nama, int lebar, int panjang) {
		namaSpesies=nama;
		lebarDaun=lebar;
		panjangBatang=panjang;
	}
	
	public void cetakTumbuhan2() {
		System.out.println(namaSpesies+ " " + lebarDaun+ " " + panjangBatang);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tumbuhan2 tumbuhan2 = new Tumbuhan2();
		tumbuhan2.cetakTumbuhan2();
		
		tumbuhan2=new Tumbuhan2("Buah",30,80);
		tumbuhan2.cetakTumbuhan2();
		
		tumbuhan2=new Tumbuhan2("Beringin",50,45);
		tumbuhan2.cetakTumbuhan2();
	}

}
