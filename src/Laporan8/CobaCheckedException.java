package Laporan8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CobaCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream file=new FileInputStream("/media/Multimedia/coba");
			System.out.println("File ada");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException terjadi");
		}
	}

}
