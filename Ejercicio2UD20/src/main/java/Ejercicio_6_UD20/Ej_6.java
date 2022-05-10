package Ejercicio_6_UD20;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Ej_6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtKilos;
	private JTextField txtIMC;

	public Ej_6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 350, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtAltura = new JTextField();
		txtAltura.setBounds(240, 35, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(141, 38, 89, 14);
		contentPane.add(lblNewLabel);

		txtKilos = new JTextField();
		txtKilos.setBounds(240, 62, 86, 20);
		contentPane.add(txtKilos);
		txtKilos.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Peso (kilos)");
		lblNewLabel_1.setBounds(141, 65, 89, 14);
		contentPane.add(lblNewLabel_1);

		JButton calcularIMC = new JButton("Calc IMC");
		calcularIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat f1 = new DecimalFormat("#.00");
				double altura = Double.parseDouble(txtAltura.getText());
				double peso = Double.parseDouble(txtKilos.getText());
				altura = altura * altura;
				double imc = peso / altura;
				txtIMC.setText(f1.format(imc));
			}
		});
		calcularIMC.setBounds(141, 96, 89, 23);
		contentPane.add(calcularIMC);

		txtIMC = new JTextField();
		txtIMC.setEditable(false);
		txtIMC.setBounds(240, 97, 86, 20);
		contentPane.add(txtIMC);
		txtIMC.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(336, 100, 46, 14);
		contentPane.add(lblNewLabel_2);
	}

}
