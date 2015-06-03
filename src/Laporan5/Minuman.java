package Laporan5;

public class Minuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minuman objekMinuman=new Minuman();
		Makanan objekMakanan=null;
		if (objekMinuman instanceof Minuman) {
			System.out.println("objekMinuman adalah instan dari kelas " + "Makanan");
		}
		if (objekMakanan==null) {
			System.out.println("objek makanan belum di instansiasi");
		}
	}

}
