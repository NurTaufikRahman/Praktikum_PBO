package Laporan4;

public class BreakDemoDua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			int k = 0;
			for (;;) {
				do {
					if (k == 22)
						break;
					k++;
				} while (k <= 10);
				break;
			}
			System.out.println("k = " + k);
		}
	}

}
