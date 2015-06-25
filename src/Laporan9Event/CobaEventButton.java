package Laporan9Event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaEventButton extends JFrame {

	JButton button1;

	public CobaEventButton() {
		super("Even di Swing");
		setLayout(new FlowLayout());
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void createLayout() {
		button1 = new JButton("Klik Bede'");
		button1.addActionListener(new ButtonListener());
		add(button1);
	}

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			button1.setText("OK Mi");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CobaEventButton();
	}

}
