package Laporan4;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kalimat = "Ular lari lurus di dalam hUtan rimba";

		int maks = kalimat.length();
		int jumlahR = 0;

		for (int i = 0; i < maks; i++) {
			if (kalimat.charAt(i) != 'U')
				continue;

			jumlahR++;
		}
		System.out.println("Ditemukan " + jumlahR
				+ " huruf U Kapital dalam kalimat.");
	}

}
