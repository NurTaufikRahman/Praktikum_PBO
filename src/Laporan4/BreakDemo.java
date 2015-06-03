package Laporan4;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nilai = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		int cari = 2000;

		int i;
		boolean ketemu = false;

		for (i = 0; i < nilai.length; i++) {
			if (nilai[i] == cari) {
				ketemu = true;
				break;
			}
		}
		if (ketemu) {
			System.out.println("Ditemukan " + cari + " pada index " + i);
		} else {
			System.out.println(cari + " tidak terdapat dalam array");
		}
	}

}
