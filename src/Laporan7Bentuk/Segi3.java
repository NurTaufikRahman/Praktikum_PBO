package Laporan7Bentuk;

public abstract class Segi3 extends Bentuk {
	
	protected float alas;
	protected float tinggi;
	
	public Segi3(){
		alas=5;
		tinggi=5;
	}
	
	public float hitungLuas(){
		return (alas*tinggi)/2;
	}


}
