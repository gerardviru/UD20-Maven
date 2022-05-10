package Ejercicio8UD20.Ejercicio8UD20;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ejercicio8 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private double TASA_CONVERSION = 16638.6;
	private double TASA_CONVERSION_2 = 0.6;
	
	public static void Ejercicio8() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio8 frame = new Ejercicio8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Ejercicio8() {
		
		setTitle("Calculadora a cambio de monedas");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Introducir la cantidad a convertir
		JLabel lblNewLabel = new JLabel("Cantidad a convertir:");
		lblNewLabel.setBounds(29, 30, 117, 23);
		contentPane.add(lblNewLabel);
		
		// TextField donde se muestra el valor introducido
		textField = new JTextField();
		textField.setBounds(148, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// Boton para convertir "Euros a Pesetas"
		final JButton btnconversion = new JButton("Euros a Pesetas");
		btnconversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double resultado = 0.0;
				
				try {
					// Si el boton es igual a euros pesetas se ejecuta el if, sino tirará por el else
					if (btnconversion.getText().equals("Euros a Pesetas")) {
						resultado = Math.round((Double.parseDouble(textField.getText())*TASA_CONVERSION)/100);
					} else {
						resultado = Math.round((Double.parseDouble(textField.getText())*TASA_CONVERSION_2)/100);
					}
					textField_2.setText(" "+ resultado +" ");
					
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "El valor introducido no es válido.\n Error Capturado :"+ ex + "\nDebes introducir un número entero");
					}
				}
			
		});
		
		btnconversion.setBounds(77, 100, 130, 23);
		contentPane.add(btnconversion);
		
		//Boton para cambiar de euros a monedas o de pesetas a euros
		JButton btnPesetasAEuros = new JButton("Cambiar");
		btnPesetasAEuros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnconversion.getText().equals("Euros a Pesetas")) {
					btnconversion.setText("Pesetas a euros");
				} else {
					btnconversion.setText("Euros a Pesetas");
						
				}
				btnconversion.doClick();
			}
		});
		btnPesetasAEuros.setBounds(271, 100, 122, 23);
		contentPane.add(btnPesetasAEuros);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Resultado : ");
		lblNewLabel_1.setBounds(271, 34, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(331, 31, 86, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_2.setText("");
				
			}
		});
		btnNewButton_1.setBounds(195, 146, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}


