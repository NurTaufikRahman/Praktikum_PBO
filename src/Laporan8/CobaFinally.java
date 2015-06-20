package Laporan8;

public class CobaFinally {
	
	public static void cobaMetode(){
		int a[]= new int[2];
		try {
			System.out.println("Akses elemen kedua :"+a[1]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException terjadi");
		} finally {
			a[0]=6;
			System.out.println("Nilai Elemen pertama :" +a[0]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cobaMetode();
	}

}
