package Laporan5;

public class Argumen {

	public static void passingPrimitif(int i) {
		i=5;
	}
	public static void passingObject(Koma t) {
		t.x=4;
		t.y=5;
	}
	public static void cobaObject(Taufik a) {

		a.o=6;
		a.p=8;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		passingPrimitif(i);
		System.out.println(i);
		
		Koma t = new Koma();
		passingObject(t);
		System.out.println(t.x + " " + t.y);
		
		Taufik a = new Taufik();
		cobaObject(a);
		System.out.println(a.o + " " + a.p);
	}

}
class Koma{
	public int x;
	public int y;
	
	public Koma() {
		x=0;
		y=0;
	}
}
class Taufik{
	public int o;
	public int p;
	
	public Taufik() {
		o=2;
		p=4;
	}
}