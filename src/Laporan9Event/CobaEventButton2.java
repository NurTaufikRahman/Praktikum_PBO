package Laporan9Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaEventButton2 extends JFrame {

	JButton button1;
	JButton button2;
	JButton button3;

	public CobaEventButton2() {
		super("Even di Swing");
		setLayout(null);
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void createLayout() {
		button1 = new JButton("Klik Ki Coba");
		button1.setBounds(20, 10, 150, 50);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setText("Ter klik mi");
			}
		});
		add(button1);
		
		button2 = new JButton("Taufik");
		button2.setBounds(100, 100, 150, 50);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button2.setText("Rahman");
			}
		});
		add(button2);
		
		button3 = new JButton("Manchester");
		button3.setBounds(150, 200, 150, 50);
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button3.setText("United");
			}
		});
		add(button3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CobaEventButton2();
	}

}
