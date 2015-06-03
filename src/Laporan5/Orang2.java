package Laporan5;

public class Orang2 {
	public String nama;
	public String alamat;
	public int tinggiBadan;
	public float beratBadan;
	
	public void cetakOrang() {
		System.out.println("Nama :"+ nama + " Alamat :" + alamat + " TinggiBadan :" + tinggiBadan + " BeratBadan :" + beratBadan);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orang2 objekOrang=new Orang2();
		objekOrang.nama="Taufik";
		objekOrang.alamat="Sidrap";
		objekOrang.tinggiBadan=170;
		objekOrang.beratBadan=60.4f;
		objekOrang.cetakOrang();
		
		Orang2 objekOrangDua=new Orang2();
		objekOrangDua.nama="Rooney";
		objekOrangDua.alamat="Manchester";
		objekOrangDua.tinggiBadan=185;
		objekOrangDua.beratBadan=70.4f;
		objekOrangDua.cetakOrang();
		
		Orang2 objekOrangTiga=new Orang2();
		objekOrangTiga.nama="Van Persie";
		objekOrangTiga.alamat="Amsterdam";
		objekOrangTiga.tinggiBadan=190;
		objekOrangTiga.beratBadan=75.4f;
		objekOrangTiga.cetakOrang();
	}

}
