package Laporan6Mobil;

import Laporan6Utama.Mobil;

public class Taxi extends Mobil {
	
	public String nama;
	
	public Taxi(){
		super();
	}
	
	public Taxi(String nama){
		super(nama);
	}
	
	public void Cetak(String nama){
		super.nama=nama;
		this.nama="Taxi lokal";
		
		System.out.println(nama);
		System.out.println(this.nama);
	}
	
	public void stater(){
		System.out.println("Stater Taxi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi = new Taxi();
		taxi.Cetak("Taxi");
	}

}
