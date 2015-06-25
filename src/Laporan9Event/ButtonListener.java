package Laporan9Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListener implements ActionListener {

	JButton button1;

	public ButtonListener(JButton button1) {
		this.button1 = button1;
	}

	public void actionPerformed(ActionEvent even) {
		button1.setText("Mantap");
	}

}
