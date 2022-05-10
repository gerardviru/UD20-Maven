package UD20.Ejercicio4UD20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Vista extends JFrame implements WindowListener {

	private JPanel contentPane;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void crearVista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setLocationRelativeTo(null);
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		addWindowListener(this);

		JLabel labelEventos = new JLabel("Eventos");
		labelEventos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelEventos.setBounds(10, 116, 55, 14);
		contentPane.add(labelEventos);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(75, 11, 444, 412);
		contentPane.add(textArea);
		this.textArea = textArea;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		textArea.append("Abierto \n");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		textArea.append("Iconified \n");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		textArea.append("deiconified \n");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		textArea.append("deactivated \n");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		textArea.append("Cerrando ventana \n");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		textArea.append("Ventana Cerrada \n");


	}

	@Override
	public void windowActivated(WindowEvent e) {
		textArea.append("Ventana Activada \n");

	}

}
