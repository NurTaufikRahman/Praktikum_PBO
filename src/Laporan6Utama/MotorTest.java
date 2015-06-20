package Laporan6Utama;

import Laporan6Mobil.Pete2;
import Laporan6Mobil.Taxi;

public class MotorTest {
	
	public static void staterMobil(Mobil mobil){
		mobil.stater();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil taxi= new Taxi();
		Pete2 pete2 = new Pete2();
		
		staterMobil(new Mobil());
		
		staterMobil(taxi);
		
		staterMobil(pete2);
		
	}

}