package bb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class bbb {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bbb window = new bbb();
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
	public bbb() {
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"topla", "\u00E7arp", "b\u00F6l", "\u00E7\u0131kart"}));
		comboBox.setBounds(269, 53, 118, 29);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String islemTipi = comboBox.getSelectedItem().toString();
				//JOptionPane.showMessageDialog (frame,islemTipi);
			  String sayiText = textField.getText();
			  String sayiText2 = textField_1.getText();
			  
			  float sayi1= Byte.valueOf(sayiText);
			  float sayi2= Byte.valueOf(sayiText2);
			  if (islemTipi == "topla") {
				  float topla = sayi1+sayi2;
				JOptionPane.showMessageDialog (frame,topla);
			  }
			  if (islemTipi =="çýkart") {
				  float çýkart = sayi1-sayi2;
					JOptionPane.showMessageDialog (frame,çýkart);
			  }
			  if (islemTipi =="çarp") {
				  float çarp = sayi1*sayi2 ;
					JOptionPane.showMessageDialog (frame,çarp);
			  }
			  if (islemTipi == "böl") {
				  float böl = sayi1/sayi2 ;
					JOptionPane.showMessageDialog (frame,böl);
					



			  }
				
				

				
				
			

			}
		});
		btnNewButton.setBounds(159, 148, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(134, 57, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 108, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
