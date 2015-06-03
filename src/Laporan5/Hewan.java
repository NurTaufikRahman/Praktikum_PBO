package Laporan5;

public class Hewan {
	public void spesies() {
		System.out.println("Spesies 1");
	}
	public void spesies(String nama) {
		System.out.println("Spesies 2");
	}
	public void spesies(int jumlah) {
		System.out.println("Spesies 3");
	}
	public void spesies(long jumlah) {
		System.out.println("Spesies 4");
	}
	
	public String spesies(String nama,int jumlah){
		return "Spesies 5";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hewan hew=new Hewan();
		hew.spesies();
		hew.spesies("Bebek");
		hew.spesies(4);
		hew.spesies(51);
		System.out.println(hew.spesies("Bebek", 5));
	}

}
