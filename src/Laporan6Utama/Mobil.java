package Laporan6Utama;

import Laporan6.Rangka;

public class Mobil {

	private Rangka rangka;
	
	public Laporan6.Mesin mesin;
	
	private int nomer;
	
	protected String nama;
	
	public Mobil(){
		rangka = new Rangka();
		mesin = new Laporan6.Mesin();
		System.out.println("Konstruktor Mobil");
	}
	
	public void stater(){
		System.out.println("Stater Mobil");
	}
	
	public Mobil (String nama){
		this.nama=nama;
	}
	
	public static void main (String[] args){
		new Mobil();
	}

}
