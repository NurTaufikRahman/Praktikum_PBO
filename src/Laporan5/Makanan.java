package Laporan5;

public class Makanan {
	public static int JUMLAH_MAKANAN = 2;
	public String jenis;

	public static void tambahMakanan() {
		JUMLAH_MAKANAN++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Makanan objekMakanan = new Makanan();
		objekMakanan.jenis = "PIZZA";
		Makanan.tambahMakanan();
		System.out.println(Makanan.JUMLAH_MAKANAN);

		Makanan objekMakananDua = new Makanan();
		objekMakanan.jenis = "SPAGHETY";
		Makanan.tambahMakanan();
		System.out.println(Makanan.JUMLAH_MAKANAN);
		
		Makanan objekMakananTiga = new Makanan();
		objekMakanan.jenis = "PALEKKO";
		Makanan.tambahMakanan();
		System.out.println(Makanan.JUMLAH_MAKANAN);
		
		System.out.println(objekMakanan.JUMLAH_MAKANAN);
		System.out.println(objekMakananDua.JUMLAH_MAKANAN);
		System.out.println(objekMakananTiga.JUMLAH_MAKANAN);
	}

}
