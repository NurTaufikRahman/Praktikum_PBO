package Laporan4;

public class ContinueLabelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kalimat = "Manchester United adalah klub sepak bola terkaya kedua di dunia";
		String cari = " United ";
		boolean ketemu = false;

		int max = kalimat.length() - cari.length();

		test: for (int i = 0; i <= max; i++) {
			int n = cari.length();
			int j = i;
			int k = 0;
			while (n-- != 0) {
				if (kalimat.charAt(j++) != cari.charAt(k++)) {
					continue test;
				}
			}
			ketemu = true;
			break test;
		}
		System.out.println(ketemu ? "Ketemu" : "Tidak Ketemu");
	}
}
