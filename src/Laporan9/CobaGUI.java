package Laporan9;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CobaGUI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Halo Swing");
		JLabel label = new JLabel("Tes Label");
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(300,100);
		
		frame.setVisible(true);
	}

}
