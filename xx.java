package com.x;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class xx {

	private JFrame frame;
	private JTextField textSayi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xx window = new xx();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public xx() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textSayi = new JTextField();
		textSayi.setBounds(188, 101, 86, 20);
		frame.getContentPane().add(textSayi);
		textSayi.setColumns(10);
		
		JButton hesapla = new JButton("hesapla");
		hesapla.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
			String sayitext= textSayi.getText();
			Byte sayi1=Byte.valueOf(sayitext);
			if(sayi1<0 || sayi1>50) {
				JOptionPane.showMessageDialog (frame,"Girilen sayý 0-50 arasýnda olmalýdýr");
			} else {
				if (sayi1 %5 == 0) {
					JOptionPane.showMessageDialog (frame,"Girilen sayý 5 in katýdýr");}
		        else if (sayi1 %4 == 0) {
					JOptionPane.showMessageDialog (frame,"Girilen sayý 4 in katýdýr");}
					else if (sayi1 %3 == 0) {
						JOptionPane.showMessageDialog (frame,"Girilen sayý 3 in katýdýr");
						 if (sayi1 %2 == 0) {
							JOptionPane.showMessageDialog (frame,"Girilen sayý 2 in katýdýr");
							

						
					}

				}
				}
				
		
				
		
				
			
			   
				
			}
		});
		hesapla.setBounds(185, 148, 89, 23);
		frame.getContentPane().add(hesapla);
		
		
		JLabel lbl1 = new JLabel("i");
		lbl1.setBounds(114, 104, 46, 14);
		frame.getContentPane().add(lbl1);
		
	}

}
