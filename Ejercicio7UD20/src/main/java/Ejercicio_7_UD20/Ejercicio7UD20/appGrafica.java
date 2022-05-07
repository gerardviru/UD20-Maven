package Ejercicio_7_UD20.Ejercicio7UD20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class appGrafica extends JFrame {
	

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	


	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appGrafica frame = new appGrafica();
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
	public appGrafica() {
		
		setTitle("Calculadora a cambio de monedas");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 219);
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
		JButton btnNewButton = new JButton("Euros a Pesetas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double resultado = 0.0;
				// Si el boton es igual a euros pesetas se ejecuta el if, si no tirará por el else
				if (btnNewButton.getText().equals("Euros a Pesetas")) {
					resultado = Math.round((Double.parseDouble(textField.getText())*16638.6)/100);
				} else {
					resultado = Math.round((Double.parseDouble(textField.getText())*0.6)/100);
				}
				textField_2.setText(""+resultado+"");
			}
		});
		
		btnNewButton.setBounds(77, 100, 130, 23);
		contentPane.add(btnNewButton);
		
		//Boton para cambiar de euros a monedas o de pesetas a euros
		JButton btnPesetasAEuros = new JButton("Cambiar");
		btnPesetasAEuros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnNewButton.getText().equals("Euros a Pesetas")) {
					btnNewButton.setText("Pesetas a euros");
				} else {
					btnNewButton.setText("Euros a Pesetas");
						
				}
				btnNewButton.doClick();
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
	}
}
