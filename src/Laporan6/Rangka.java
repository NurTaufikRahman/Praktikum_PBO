package Laporan6;

public class Rangka {
	private Ban ban;

	public Rangka() {
		ban = new Ban();
		System.out.println("Konstruktor Rangka");
	}
}

class Ban {
	public Ban() {
		System.out.println("Konstruktor Ban");
	}
}
