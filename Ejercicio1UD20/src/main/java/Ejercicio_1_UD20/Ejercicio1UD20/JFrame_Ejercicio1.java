package Ejercicio_1_UD20.Ejercicio1UD20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Dialog.ModalExclusionType;

public class JFrame_Ejercicio1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Execute() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_Ejercicio1 frame = new JFrame_Ejercicio1();
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
	public JFrame_Ejercicio1() {
		setTitle("Ejercicio 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Etiqueta Rescalable");
		etiqueta.setBounds(0, 3, 18, -3);
		getContentPane().add(etiqueta);
		setResizable(true);
		pack();
		setVisible(true);

	}
}
