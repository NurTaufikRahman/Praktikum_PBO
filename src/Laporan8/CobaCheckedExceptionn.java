package Laporan8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CobaCheckedExceptionn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream file=new FileInputStream("/media/Multimedia/cobaa");
			System.out.println("File ada");
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException terjadi");
		} catch (IOException e) {
			System.out.println("IOException terjadi");
		} catch (Exception e) {
			System.out.println("Exception terjadi");
		}
	}

}
