package Ejercicio_9_UD20.ejercicio9UD20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Memory extends JFrame {

	private JPanel contentPane;
	private ArrayList<JToggleButton> listaToggleButton = new ArrayList<JToggleButton>();
	private ArrayList<Color> listaColores = new ArrayList<Color>();

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtn_1 = new JToggleButton("");
		//tglbtn_1.setSelectedIcon(new ImageIcon(Memory.class.getResource("../com/sun/java/swing/plaf/windows/icons/Error.gif")));	
		tglbtn_1.setName("btn1");
		tglbtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		tglbtn_1.setBounds(44, 32, 121, 119);
		contentPane.add(tglbtn_1);
		
		JToggleButton tglbtn_2 = new JToggleButton("");
		tglbtn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		tglbtn_2.setBounds(176, 32, 121, 119);
		contentPane.add(tglbtn_2);
		
		JToggleButton tglbtn_3 = new JToggleButton("");
		
		tglbtn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_3.setBounds(307, 32, 121, 119);
		contentPane.add(tglbtn_3);
		
		JToggleButton tglbtn_4 = new JToggleButton("");
		tglbtn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_4.setBounds(438, 32, 121, 119);
		contentPane.add(tglbtn_4);
		
		JToggleButton tglbtn_5 = new JToggleButton("");
		tglbtn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_5.setBounds(44, 162, 121, 119);
		contentPane.add(tglbtn_5);
		
		JToggleButton tglbtn_6 = new JToggleButton("");
		tglbtn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_6.setBounds(175, 162, 121, 119);
		contentPane.add(tglbtn_6);
		
		JToggleButton tglbtn_7 = new JToggleButton("");
		tglbtn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_7.setBounds(307, 162, 121, 119);
		contentPane.add(tglbtn_7);
		
		JToggleButton tglbtn_8 = new JToggleButton("");
		tglbtn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_8.setBounds(438, 162, 121, 119);
		contentPane.add(tglbtn_8);
		
		JToggleButton tglbtn_9 = new JToggleButton("");
		tglbtn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_9.setBounds(44, 292, 121, 119);
		contentPane.add(tglbtn_9);
		
		JToggleButton tglbtn_10 = new JToggleButton("");
		tglbtn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_10.setBounds(175, 292, 121, 119);
		contentPane.add(tglbtn_10);
		
		JToggleButton tglbtn_11 = new JToggleButton("");
		tglbtn_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_11.setBounds(307, 292, 121, 119);
		contentPane.add(tglbtn_11);
		
		JToggleButton tglbtn_12 = new JToggleButton("");
		tglbtn_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_12.setBounds(438, 292, 121, 119);
		contentPane.add(tglbtn_12);
		
		JToggleButton tglbtn_13 = new JToggleButton("");
		tglbtn_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_13.setBounds(44, 418, 121, 119);
		contentPane.add(tglbtn_13);
		
		JToggleButton tglbtn_14 = new JToggleButton("");
		tglbtn_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_14.setBounds(175, 418, 121, 119);
		contentPane.add(tglbtn_14);
		
		JToggleButton tglbtn_15 = new JToggleButton("");
		tglbtn_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_15.setBounds(307, 418, 121, 119);
		contentPane.add(tglbtn_15);
		
		JToggleButton tglbtn_16 = new JToggleButton("");
		tglbtn_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tglbtn_16.setBounds(438, 418, 121, 119);
		contentPane.add(tglbtn_16);
		
		
		//Los añadimos al arrayList
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
		
		// Recorrem la llista segons la seva mida per donar-li el valor d'un color aleatori
		for (int i = 0; i < listaToggleButton.size(); i++) {
			//listaToggleButton(i).setBackground(Color.black);
			listaToggleButton.get(i).setBackground(colorAleatori());
			// Perque es girin totes i no es mostri el color
			listaToggleButton.get(i).setSelected(true);
			
		}
		

	}
	
	// Metode on lhi pasem el minim i el maxim perque ens creeí un numero aleatori
	private int crearNumAleatorio(int min, int max) {
		Random random = new Random();
		
		int numero = random.nextInt(max + min) + min;
		System.out.println(numero);
		
	return numero;	
	}

	private Color colorAleatori() {
	
		listaColores.add(Color.black);
		listaColores.add(Color.red);
		listaColores.add(Color.blue);
		listaColores.add(Color.green);
		listaColores.add(Color.magenta);
		listaColores.add(Color.pink);
		listaColores.add(Color.yellow);
		listaColores.add(Color.orange);
		
		
	// Retorna un color aleatorio a través del numero aleatorio que hem creat anteriorment
	return listaColores.get(crearNumAleatorio(0, 8));
	
	}
	
	
	// Fer una llista on fico tots els colors, i cada vegada que s'introdueixi un color verifiqui si esta a la llista, que no es repeteixi mes de dues vegades
	//private int noRepetit() {
		//if 
		
	//}
	
}
