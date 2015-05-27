package Laporan4;

public class BreakLabelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayCode = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 },
				{ 622, 127, 77, 955 } };
		int cari = 77;

		int i;
		int j = 0;
		boolean ketemu = false;

		keluar: for (i = 0; i < arrayCode.length; i++) {
			for (j = 0; j < arrayCode[i].length; j++) {
				if (arrayCode[i][j] == cari) {
					ketemu = true;
					break keluar;
				}
			}
		}
		if (ketemu) {
			System.out.println("Ketemu " + cari + " pada index " + i + "," + j);
		} else {
			System.out.println(cari + " tidak terdapat dalam array");
		}
	}

}
