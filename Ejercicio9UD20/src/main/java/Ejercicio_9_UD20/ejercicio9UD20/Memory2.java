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

public class Memory2 extends JFrame {

	private JPanel contentPane;
	private ArrayList<JToggleButton> listaToggleButton = new ArrayList<JToggleButton>();// contindra botons
	private ArrayList<Color> listaColores = new ArrayList<Color>(); // contindra tots els tipos de colors diferents
	private ArrayList<Color> listaColoresNoRepetidos = new ArrayList<Color>(); // control de colors repetits
	private boolean btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15,
			btn16;
	private JToggleButton tglbtn_1, tglbtn_2, tglbtn_3, tglbtn_4, tglbtn_5, tglbtn_6, tglbtn_7, tglbtn_8, tglbtn_9,
			tglbtn_10, tglbtn_11, tglbtn_12, tglbtn_13, tglbtn_14, tglbtn_15, tglbtn_16;
	private int pulsats= 0;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memory2 frame = new Memory2();
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
	public Memory2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tglbtn_1 = new JToggleButton("");
		// tglbtn_1.setSelectedIcon(new
		// ImageIcon(Memory.class.getResource("../com/sun/java/swing/plaf/windows/icons/Error.gif")));
		tglbtn_1.setName("btn1");
		tglbtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtn_1.isSelected()) {
					btn1 = true;
					pulsats--;
				} else {
					btn1 = false;
					pulsats++;
				}
				System.out.println(btn1);
				maximDos();
			}
		});

		tglbtn_1.setBounds(44, 32, 121, 119);
		contentPane.add(tglbtn_1);

		tglbtn_2 = new JToggleButton("");
		tglbtn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_2.isSelected()) {
					btn2 = true;
				} else {
					btn2 = false;
				}
			
			}
		});
		tglbtn_2.setBounds(176, 32, 121, 119);
		contentPane.add(tglbtn_2);

		tglbtn_3 = new JToggleButton("");

		tglbtn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_3.isSelected()) {
					btn3 = true;
				} else {
					btn3 = false;
				}
			}
		});
		tglbtn_3.setBounds(307, 32, 121, 119);
		contentPane.add(tglbtn_3);

		tglbtn_4 = new JToggleButton("");
		tglbtn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_4.isSelected()) {
					btn4 = true;
				} else {
					btn4 = false;
				}
			}
		});
		tglbtn_4.setBounds(438, 32, 121, 119);
		contentPane.add(tglbtn_4);

		tglbtn_5 = new JToggleButton("");
		tglbtn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_5.isSelected()) {
					btn5 = true;
				} else {
					btn5 = false;
				}
			}
		});
		tglbtn_5.setBounds(44, 162, 121, 119);
		contentPane.add(tglbtn_5);

		tglbtn_6 = new JToggleButton("");
		tglbtn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();	if (tglbtn_6.isSelected()) {
					btn6 = true;
				} else {
					btn6 = false;
				}
				
			}
		});
		tglbtn_6.setBounds(175, 162, 121, 119);
		contentPane.add(tglbtn_6);

		tglbtn_7 = new JToggleButton("");
		tglbtn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_7.isSelected()) {
					btn7 = true;
				} else {
					btn7 = false;
				}
			}
		});
		tglbtn_7.setBounds(307, 162, 121, 119);
		contentPane.add(tglbtn_7);

		tglbtn_8 = new JToggleButton("");
		tglbtn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_8.isSelected()) {
					btn8 = true;
				} else {
					btn8 = false;
				}
			}
		});
		tglbtn_8.setBounds(438, 162, 121, 119);
		contentPane.add(tglbtn_8);

		tglbtn_9 = new JToggleButton("");
		tglbtn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_9.isSelected()) {
					btn9 = true;
				} else {
					btn9 = false;
				}
			}
		});
		tglbtn_9.setBounds(44, 292, 121, 119);
		contentPane.add(tglbtn_9);

		tglbtn_10 = new JToggleButton("");
		tglbtn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_10.isSelected()) {
					btn10 = true;
				} else {
					btn10 = false;
				}
			}
		});
		tglbtn_10.setBounds(175, 292, 121, 119);
		contentPane.add(tglbtn_10);

		tglbtn_11 = new JToggleButton("");
		tglbtn_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_11.isSelected()) {
					btn11 = true;
				} else {
					btn11 = false;
				}
			}
		});
		tglbtn_11.setBounds(307, 292, 121, 119);
		contentPane.add(tglbtn_11);

		tglbtn_12 = new JToggleButton("");
		tglbtn_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_12.isSelected()) {
					btn12 = true;
				} else {
					btn12 = false;
				}
			}
		});
		tglbtn_12.setBounds(438, 292, 121, 119);
		contentPane.add(tglbtn_12);

		tglbtn_13 = new JToggleButton("");
		tglbtn_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_13.isSelected()) {
					btn13 = true;
				} else {
					btn13 = false;
				}
			}
		});
		tglbtn_13.setBounds(44, 418, 121, 119);
		contentPane.add(tglbtn_13);

		tglbtn_14 = new JToggleButton("");
		tglbtn_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_14.isSelected()) {
					btn14 = true;
				} else {
					btn14 = false;
				}
			}
		});
		tglbtn_14.setBounds(175, 418, 121, 119);
		contentPane.add(tglbtn_14);

		tglbtn_15 = new JToggleButton("");
		tglbtn_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_15.isSelected()) {
					btn15 = true;
				} else {
					btn15 = false;
				}
			}
		});
		tglbtn_15.setBounds(307, 418, 121, 119);
		contentPane.add(tglbtn_15);

		tglbtn_16 = new JToggleButton("");
		tglbtn_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maximDos();
				if (tglbtn_16.isSelected()) {
					btn16 = true;
				} else {
					btn16 = false;
				}
			}
		});
		tglbtn_16.setBounds(438, 418, 121, 119);
		contentPane.add(tglbtn_16);

		// Los añadimos al arrayList
		listaToggleButton.add(tglbtn_1);
		listaToggleButton.add(tglbtn_2);
		listaToggleButton.add(tglbtn_3);
		listaToggleButton.add(tglbtn_4);
		listaToggleButton.add(tglbtn_5);
		listaToggleButton.add(tglbtn_6);
		listaToggleButton.add(tglbtn_7);
		listaToggleButton.add(tglbtn_8);
		listaToggleButton.add(tglbtn_9);
		listaToggleButton.add(tglbtn_10);
		listaToggleButton.add(tglbtn_11);
		listaToggleButton.add(tglbtn_12);
		listaToggleButton.add(tglbtn_13);
		listaToggleButton.add(tglbtn_14);
		listaToggleButton.add(tglbtn_15);
		listaToggleButton.add(tglbtn_16);

		donarColorLLista();
		// Recorrem la llista segons la seva mida per donar-li el valor d'un color
		// aleatori
		for (int i = 0; i < listaToggleButton.size(); i++) {
			// listaToggleButton(i).setBackground(Color.black);
			// listaToggleButton.get(i).setBackground(colorAleatori());
			// Perque es girin totes i no es mostri el color
			listaToggleButton.get(i).setSelected(true);

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

	public boolean esRepetit(Color colorAleatori) { 				// Metode per revisar si el color es repeteix + de dues vegades
		int contador = 0; 											// Inicialitza un contador
		for (int i = 0; i < listaColoresNoRepetidos.size(); i++) {	// Recorrem la llista de colors no repetits segons la
																	// seva mida
			if (listaColoresNoRepetidos.get(i) == colorAleatori) { 	// Si la posicio de la llista es igual al color
																	// aleatori pasat pel constructor, es suma
				contador++;
			}
			if (contador >= 2) { 									// Si el contador es mes gran de 2 no es sumará
				return true; 										//no dona valor al boto i busquem un altre cop
			}

		}
		return false; // okey per donar valor al boto

	}

	public void donarColorLLista() { 								// Reomplir els TuggleButtons amb el seu colors

		for (int i = 0; i < listaToggleButton.size(); i++) { 		// Recorrem la llista de TougleButtons
			boolean revisador = true; 								// Creem un revisador amb el valor true
																	// Invoquem el metode Crear Aleatori, lhi donem la varieble 'color'

			while (revisador == true) { 							// Mentres el revisador sigui true, entrará al While
				Color color = colorAleatori();
				if (esRepetit(color) == false) { 					// Si la condicio es repetit amb la variable color es false,
					listaToggleButton.get(i).setBackground(color); 	// S'afegirá el valor al Touglebutton
					listaColoresNoRepetidos.add(color); 			// S'actualitza el valor a la llista
					revisador = false; 								//I el revisador pasará a false, per sortir de while

				}
			}

		}
	}

	public void igualDesapareix() {
		Color colorCarta;
		for (int i = 0; i < listaToggleButton.size(); i++) {
			colorCarta = listaToggleButton.get(i).getBackground();
			// if (colorCarta = )

		}
	}

	public void maximDos() {
		int pulsado = 0;
		for (int i = 0; i < listaToggleButton.size(); i++) {
			if (listaToggleButton.get(i).isSelected() == false) {
				pulsado++;
				listaToggleButton.get(i).isEnabled();
			}
		}
		if (pulsado ==3) {
			pulsats = 0;
			girarCartas();
		}

	}

	public void girarCartas() {

		for (int j = 0; j < listaToggleButton.size(); j++) {
			listaToggleButton.get(j).setSelected(true);
		}

	}


}
