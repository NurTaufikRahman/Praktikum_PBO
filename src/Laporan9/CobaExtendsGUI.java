package Laporan9;

import javax.swing.JFrame;
import javax.swing.JButton;

public class CobaExtendsGUI extends JFrame {
	
	JButton button;
	
	public CobaExtendsGUI(){
		super("Hallo");
		button=new JButton("Tes Button");
		add(button);
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	static CobaExtendsGUI gui; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gui=new CobaExtendsGUI();
	}

}