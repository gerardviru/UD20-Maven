package Ejercicio_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej_2 implements ActionListener{

	private JFrame frame;
	private JLabel lblPrincipal;
	private JButton btn1;
	private JButton btn2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej_2 window = new Ej_2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Ej_2() {
		initialize();
	}

	private void initialize() {
		
	
		frame = new JFrame();
		btn1 = new JButton("Boton1");
		lblPrincipal = new JLabel("Has pulsado: ");
		btn2 = new JButton("Boton2");
		

		frame.setBounds(650, 350, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblPrincipal.setBounds(37, 31, 130, 16);
		btn1.setBounds(177, 25, 122, 29);
		btn2.setBounds(304, 25, 122, 29);	
		

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		

		frame.getContentPane().add(lblPrincipal);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btnPress = (JButton)e.getSource();

		String name = btnPress.getText();

		switch(name) {
			case "Boton1":
				lblPrincipal.setText("Has pulsado: ");
				lblPrincipal.setText(lblPrincipal.getText()+" "+ btn1.getText().toString());
				break;
			case "Boton2":
				lblPrincipal.setText("Has pulsado: ");
				lblPrincipal.setText(lblPrincipal.getText()+" "+ btn2.getText().toString());
				break;
		}
	}
	
}