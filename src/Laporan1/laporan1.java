/**
 * 
 */
package Laporan1;
/**
 * @author Taufik
 *
 */
public class laporan1 {

	/**
	 * @param args
	 */
	static String prak="praktikum 1";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prak);
		kali();
		bagi();
		tambah();
		kurang();
		biodata();
	}

	public static void kali(){
		int i=6*5;
		System.out.println("Hasil Kali "+i);
	}
	
	public static void bagi(){
		float i=9/3;
		System.out.println("Hasil Bagi "+i);
	}
	
	public static void tambah(){
		int i=5+5;
		System.out.println("Hasil Penjumlahan "+i);
	}
	
	public static void kurang(){
		int i=5-1;
		System.out.println("Hasil Pengurangan "+i);
	}
	
	public static void biodata(){
		String nama ="Taufik";
		String alamat = "Jl. Malino";
		System.out.println("Nama : "+nama +"\nAlamat : "+alamat);
	}
}
