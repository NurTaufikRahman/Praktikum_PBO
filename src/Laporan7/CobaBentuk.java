package Laporan7;

import Laporan7Bentuk.Bentuk;
import Laporan7Bentuk.Persegi;
import Laporan7Bentuk.SegitigaSamaKaki;
import Laporan7Bentuk.SegitigaSamaSisi;

public class CobaBentuk {

	public static void cetakBangun(Bentuk b){
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cetakBangun(new Persegi());
		cetakBangun(new SegitigaSamaKaki());
		cetakBangun(new SegitigaSamaSisi());
	}

	private static void cetakBangun(SegitigaSamaSisi segitigaSamaSisi) {
		// TODO Auto-generated method stub
		
	}

}
