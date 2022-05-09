package Ejercicio_9_UD20.ejercicio9UD20;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Controlador {

	/*
	 * Controla la logica del juego
	 */

	// Attributes
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private int totalGiradas;
	// Las cartas giradas cara arriba
	private ArrayList<Carta> cartasGiradas = new ArrayList<Carta>();
	// Los colores disponibles
	private ArrayList<Color> colores = new ArrayList<Color>();

	
	/*
	 * Constructor
	 */
	public Controlador() {
		listaColores();
	}

	// Getters Setters

	/**
	 * @return the cartas
	 */
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	/**
	 * @param cartas the cartas to set
	 */
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	// Methods

	/**
	 * Dar la vuelta a las cartas para taparlas
	 */
	public void taparCartas() {

	}

	/**
	 * Añadir carta al ArrayList
	 */
	public void anadirCarta(Carta carta) {
		this.cartas.add(carta);
	}

	/**
	 * Metode on lhi pasem el minim i el maxim perque ens creeí un numero aleatori
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public int crearNumAleatorio(int min, int max) {
		Random random = new Random();

		int numero = random.nextInt(max + min) + min;

		return numero;
	}

	/**
	 * 
	 */
	// Reomplir els TuggleButtons amb el seu colors
	public void donarColorLLista() {

		// Recorrem la llista de TougleButtons
		for (int i = 0; i < cartas.size(); i++) {
			// Creem un revisador amb el valor true
			boolean revisador = true;
			// Invoquem el metode Crear Aleatori, lhi donem la varieble 'color'

			// Mentres el revisador sigui true, entrará al While
			while (revisador == true) {
				Color color = colorAleatori();
				// Si la condicio es repetit amb la variable color es false,
				if (esRepetit(color) == false) {
					// S'afegirá el valor al Touglebutton
					cartas.get(i).setBackground(color);
					// S'actualitza el valor a la llista
					listaColoresNoRepetidos.add(color);
					// I el revisador pasará a false, per sortir de while
					revisador = false;

				}
			}

		}
	}
	
	/**
	 * 
	 * @param colorAleatori
	 * @return
	 */
	// Metode per revisar si el color es repeteix + de dues vegades
	public boolean esRepetit(Color colorAleatori) { 				
		// Inicialitza un contador
		int contador = 0; 											
		// Recorrem la llista de colors no repetits segons la
		// seva mida
		for (int i = 0; i < listaColoresNoRepetidos.size(); i++) {	
																	
			// Si la posicio de la llista es igual al color
			// aleatori pasat pel constructor, es suma
			if (listaColoresNoRepetidos.get(i) == colorAleatori) { 	
																	
				contador++;
			}
			// Si el contador es mes gran de 2 no es sumará
			//no dona valor al boto i busquem un altre cop
			if (contador >= 2) { 									
				return true; 										
			}

		}
		return false; // okey per donar valor al boto

	}
	
	/**
	 * Guardar lista de colores al crear class
	 * @return
	 */
	private void listaColores() {

		this.colores.add(Color.black);
		this.colores.add(Color.red);
		this.colores.add(Color.blue);
		this.colores.add(Color.green);
		this.colores.add(Color.magenta);
		this.colores.add(Color.pink);
		this.colores.add(Color.yellow);
		this.colores.add(Color.orange);

	}

}
