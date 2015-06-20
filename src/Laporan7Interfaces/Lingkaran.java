package Laporan7Interfaces;

public class Lingkaran implements BentukLuas,BentukKeliling {
	
	private double jari_jari;
	
	public Lingkaran(double jari_jari){
		this.jari_jari=jari_jari;
	}
	
	public double hitungKeliling(){
		return 2*BentukKeliling.PHI*jari_jari;
	}
	
	public double hitungLuas(){
		return BentukLuas.PHI*Math.pow(jari_jari, 2);
	}

}