package Laporan7Bentuk;

public class Persegi extends Bentuk {
	
	private float sisi;
	
	public Persegi(){
		sisi=5;
	}
	
	public float hitungLuas(){
		return sisi*sisi;
	}
	
	public void tulis (){
		System.out.println("Bujur Sangkar");
	}
	
}