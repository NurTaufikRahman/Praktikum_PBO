package Laporan4;

public class Kondisional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int harga = 19000;
		String barang;

		if (harga <= 3000) {
			barang = "Pulpen";
		} else if (harga <= 5000) {
			barang = "Buku Tulis";
		} else if (harga <= 10000) {
			barang = "Modul";
		} else if (harga <= 20000) {
			barang = "Buku Cetak";
		} else {
			barang = "Tas";
		}
		System.out.println("Barang = " + barang);
	}

}
