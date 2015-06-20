package Laporan7InterfacesExtend;

import Laporan7Interfaces.BentukKeliling;
import Laporan7Interfaces.BentukLuas;

public class CobaInterface {

	public static double hitungLuasBentuk(BentukLuas b) {
		return b.hitungLuas();
	}

	public static double hitungLuasKeliling(BentukKeliling b) {
		return b.hitungKeliling();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BentukInterface bentuk = new Lingkaran(3.0);
		System.out.println(hitungLuasBentuk((BentukLuas) bentuk));
		System.out.println(hitungLuasKeliling((BentukKeliling) bentuk));
	}

}
