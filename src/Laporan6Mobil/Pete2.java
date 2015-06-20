package Laporan6Mobil;

import Laporan6.Mesin;
import Laporan6.Rangka;
import Laporan6Utama.Mobil;

public class Pete2 extends Mobil {
	
	public Pete2(){
		
	}
	
	public void kap(){
		mesin =new Mesin();
		
		stater();
		
		nama="Pete2";
		
		System.out.println("Kap");
	}

	public void stater(){
		System.out.println("Stater Pete2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pete2 pete2 = new Pete2();
		pete2.kap();
	}

}
