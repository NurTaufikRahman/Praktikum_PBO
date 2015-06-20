package Laporan7InterfacesExtend;

public class Lingkaran implements HitungKeliling, HitungLuas {

	private double jari_jari;

	public Lingkaran(double jari_jari) {
		this.jari_jari = jari_jari;
	}

	public void tulis() {
		System.out.println("Lingkaran");
	}

	public double hitungKeliling() {
		return 2 * PHI * jari_jari;
	}

	public double hitungLuas() {
		return 2 * PHI * Math.pow(jari_jari, 2);
	}

}
