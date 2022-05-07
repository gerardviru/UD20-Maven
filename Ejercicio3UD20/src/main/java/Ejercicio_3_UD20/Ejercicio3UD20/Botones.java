package Ejercicio_3_UD20.Ejercicio3UD20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Botones extends JFrame {

	private JPanel contentPane;
	private int nClicks = 0;
	private int nClicks2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Botones frame = new Botones();
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
	public Botones() {
		
		setTitle("Ventana con más interacción");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Boton 1: 0 veces ");
		lblNewLabel.setBounds(68, 49, 102, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblBotonPulsado = new JLabel("Boton 2: 0 veces ");
		lblBotonPulsado.setBounds(254, 53, 102, 23);
		contentPane.add(lblBotonPulsado);
		
		
		JButton btnNewButton = new JButton("Boton 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			nClicks++;
			JButton boton1 = (JButton)e.getSource();
			lblNewLabel.setText(boton1.getText() + ": " + nClicks + " veces");
			
				
			}
		});
		
		btnNewButton.setBounds(69, 107, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Boton 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nClicks2++;
				JButton boton2 = (JButton)e.getSource();
				lblBotonPulsado.setText(boton2.getText() + ": " + nClicks2 + " veces");
				
			}
		});
		btnNewButton_1.setBounds(254, 107, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		
	}
}
