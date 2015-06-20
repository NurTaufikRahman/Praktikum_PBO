package Laporan8Custom;

public class CobaEksepsi {
	
	public static void cobaMetode(int i) {
		if (i>=0) {
			throw new CobaRuntimeException();
		}
		System.out.println("Niali i =" +i);
	}
	
	public static void cobaMetodeDua(int i) throws CobaCheckedException {
		if (i>=0) {
			throw new CobaCheckedException();
		}
		System.out.println("Niali i =" +i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			cobaMetode(-5);
			cobaMetodeDua(8);
		} catch (CobaRuntimeException e) {
			System.out.println(e.getMessage());
		} catch (CobaCheckedException e) {
			System.out.println(e.getMessage());
		}
	}

}
