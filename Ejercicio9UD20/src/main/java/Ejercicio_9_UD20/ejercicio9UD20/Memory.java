package Ejercicio_9_UD20.ejercicio9UD20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Memory extends JFrame {

	private JPanel contentPane;
	private ArrayList<JToggleButton> listaToggleButton = new ArrayList<JToggleButton>();// contindra botons
	private ArrayList<Color> listaColores = new ArrayList<Color>(); // contindra tots els tipos de colors diferents
	private ArrayList<Color> listaColoresNoRepetidos = new ArrayList<Color>(); // control de colors repetits
	
	
	/**
	 * Launch the application.
	 */
	public static void crearVistaMemory(Controlador controlador) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memory frame = new Memory(controlador);
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
	public Memory(Controlador controlador) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ArrayList<Carta> cartas = controlador.getCartas();
		
		for (int i = 0; i < cartas.size(); i++) {
			Carta carta = cartas.get(i);
			contentPane.add(carta);
		}
		
	}

}
