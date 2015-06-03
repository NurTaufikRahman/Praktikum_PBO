package Laporan5;

public class ArgumenDua {
	public static void argumenArray(int[] args) {
		System.out.println(args[0] + "," +args[1]+ "," +args[2]+ "," +args[3]+ "," +args[4]+ "," +args[5]);
	}
	
	public static void argumenSembarang(int... args) {
		System.out.println(args[0] + "," +args[1]+ "," +args[2]+ "," +args[3]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]={10,11,12,13,14,15};
		argumenArray(i);
		argumenSembarang(i);
	}

}
