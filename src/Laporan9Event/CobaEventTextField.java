package Laporan9Event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CobaEventTextField extends JFrame {
	
	JTextField textField;
	JTextField textField2;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JTextArea area;
	JButton button1;
	JButton button2;
	
	public CobaEventTextField(){
		super("Even di Swing");
		setLayout(null);
		setSize(700, 500);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void createLayout(){
		textField=new JTextField();
		textField.setBounds(300, 10, 300, 30);
		textField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent even){
				textField2.setText(textField.getText());
			}
		});
		
	textField.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent event) {
			// TODO Auto-generated method stub
			textField2.setText("Event Mouse Released");
		}
		
		@Override
		public void mousePressed(MouseEvent event) {
			// TODO Auto-generated method stub
			textField2.setText("Event Mouse Pressed");
		}
		
		@Override
		public void mouseExited(MouseEvent event) {
			// TODO Auto-generated method stub
			textField2.setText("Event Mouse Exited");
		}
		
		@Override
		public void mouseEntered(MouseEvent event) {
			// TODO Auto-generated method stub
			textField2.setText("Event Mouse Entered");
		}
		
		@Override
		public void mouseClicked(MouseEvent event) {
			// TODO Auto-generated method stub
			textField2.setText("Event Mouse Clicked");
		}
	});
	add(textField);
	
	textField2=new JTextField();
	textField2.setBounds(300, 60, 300, 30);
	add(textField2);
	
	label1=new JLabel("Kacca-kacca disini ====>");
	label1.setBounds(50, 10, 300, 30);
	add(label1);
	
	label2=new JLabel("Yang disini menjelaskan event ====>");
	label2.setBounds(50, 60, 300, 30);
	add(label2);
	
	label3=new JLabel("Text Area ===>");
	label3.setBounds(50, 120, 300, 30);
	add(label3);
	
	area=new JTextArea();
	area.setBounds(300, 120, 300, 200);
	add(area);
	
	button1=new JButton("Reset");
	button1.setBounds(100, 380, 100, 30);
	button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			textField.setText("");
			textField2.setText("");
			area.setText("");
		}
	});
	add(button1);
	
	button2=new JButton("Close");
	button2.setBounds(400, 380, 100, 30);
	button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
	add(button2);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CobaEventTextField();
	}

}
