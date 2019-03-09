package com.merve;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class form {

	private static final Component frmanSistemi = null;
	private JFrame frame;
	private JTextField ogrenci2;
	private JTextField ogrenci3;
	private JTextField ogrenci1;
	private JLabel textOgrenci3;
	private JLabel textOgrenci1;
	private JLabel textOgrenci2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form window = new form();
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
	public form() {
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
		
		JLabel lblgrenci = new JLabel("\u00F6grenci 1");
		extracted(lblgrenci).setBounds(100, 33, 46, 14);
		frame.getContentPane().add(extracted(lblgrenci));
		
		JButton hesapla = new JButton("Hesapla");
		hesapla.setBounds(138, 175, 89, 23);
		frame.getContentPane().add(hesapla);
	
		String Ogrenci1Text = extracted(textOgrenci1).getText();
		
		String Ogrenci2Text = extracted(textOgrenci2).getText();
		
		String Ogrenci3Text = extracted(textOgrenci3).getText();
		
		Byte ogrenci1Not = Byte.valueOf(Ogrenci1Text);
		Byte ogrenci2Not = Byte.valueOf(Ogrenci2Text);
		Byte ogrenci3Not = Byte.valueOf(Ogrenci3Text);
		
		float ortalama = (ogrenci1Not + ogrenci2Not + ogrenci3Not) / 3f;
	
				
		if (ogrenci1Not >= ortalama) {
			System.out.println("GEÇTÝ");
			
		}else {
			float kalmaNotu = ogrenci1Not - ortalama;
			JOptionPane.showMessageDialog( frmanSistemi, kalmaNotu + "puan altýnda KALDI.");
			
		}
		
		
		ogrenci2 = new JTextField();
		ogrenci2.setBounds(180, 73, 86, 20);
		frame.getContentPane().add(ogrenci2);
		ogrenci2.setColumns(10);
		
		ogrenci3 = new JTextField();
		ogrenci3.setBounds(180, 118, 86, 16);
		frame.getContentPane().add(ogrenci3);
		ogrenci3.setColumns(10);
		
		ogrenci1 = new JTextField();
		ogrenci1.setBounds(180, 30, 86, 20);
		frame.getContentPane().add(ogrenci1);
		ogrenci1.setColumns(10);
		
		JLabel lblgrenci_1 = new JLabel("\u00F6grenci 2");
		extracted(lblgrenci_1).setBounds(100, 76, 46, 14);
		frame.getContentPane().add(extracted(lblgrenci_1));
		
		JLabel lblgrenci_2 = new JLabel("\u00F6grenci 3");
		extracted(lblgrenci_2).setBounds(100, 121, 46, 14);
		frame.getContentPane().add(extracted(lblgrenci_2));
	}

	private JLabel extracted(JLabel textOgrenci3) {
		return textOgrenci3;
	}
}
