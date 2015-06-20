package Laporan8;

public class CobaRuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[2];
			System.out.println("Akses elemen ke empat :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException terjadi");
		}
		System.out.println("Keluar Blok ekspresi");
	}

}
