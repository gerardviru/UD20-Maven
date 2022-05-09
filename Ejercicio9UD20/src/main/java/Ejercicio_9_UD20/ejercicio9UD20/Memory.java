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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memory frame = new Memory();
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
	public Memory() {
		
		Controlador controlador = new Controlador();
		
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
	// System.out.println(listaToggleButton.get(0).isSelected());

	// Metode on lhi pasem el minim i el maxim perque ens creeí un numero aleatori
	public int crearNumAleatorio(int min, int max) {
		Random random = new Random();

		int numero = random.nextInt(max + min) + min;
		System.out.println(numero);

		return numero;
	}

	public Color colorAleatori() {

		listaColores.add(Color.black);
		listaColores.add(Color.red);
		listaColores.add(Color.blue);
		listaColores.add(Color.green);
		listaColores.add(Color.magenta);
		listaColores.add(Color.pink);
		listaColores.add(Color.yellow);
		listaColores.add(Color.orange);
		// Retorna un color aleatorio a través del numero aleatorio que hem creat
		// anteriorment
		return listaColores.get(crearNumAleatorio(0, 8));

	}

}
