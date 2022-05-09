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
	private ArrayList<ColorCarta> colores = new ArrayList<ColorCarta>();

	/*
	 * Constructor
	 */
	public Controlador() {
		crearColoresCartas();
		crearCartas();
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
	 * @return the totalGiradas
	 */
	public int getTotalGiradas() {
		return totalGiradas;
	}

	/**
	 * @param totalGiradas the totalGiradas to set
	 */
	public void setTotalGiradas(int totalGiradas) {
		this.totalGiradas = totalGiradas;
	}

	/**
	 * @return the cartasGiradas
	 */
	public ArrayList<Carta> getCartasGiradas() {
		return cartasGiradas;
	}

	/**
	 * @param cartasGiradas the cartasGiradas to set
	 */
	public void setCartasGiradas(ArrayList<Carta> cartasGiradas) {
		this.cartasGiradas = cartasGiradas;
	}

	/**
	 * Metode on lhi pasem el minim i el maxim perque ens creeí un numero aleatori
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	private int crearNumAleatorio(int min, int max) {
		Random random = new Random();

		int numero = random.nextInt(max + min) + min;

		return numero;
	}

	/**
	 * Crear y guardar los colores de las cartas
	 * 
	 * @return
	 */
	private void crearColoresCartas() {

		ColorCarta colorCarta = new ColorCarta(Color.black);
		this.colores.add(colorCarta);

		colorCarta = new ColorCarta(Color.red);
		this.colores.add(colorCarta);

		colorCarta = new ColorCarta(Color.blue);
		this.colores.add(colorCarta);

		colorCarta = new ColorCarta(Color.green);
		this.colores.add(colorCarta);

		colorCarta = new ColorCarta(Color.magenta);
		this.colores.add(colorCarta);

		colorCarta = new ColorCarta(Color.pink);
		this.colores.add(colorCarta);

		colorCarta = new ColorCarta(Color.yellow);
		this.colores.add(colorCarta);

		colorCarta = new ColorCarta(Color.orange);
		this.colores.add(colorCarta);
	}

	/**
	 * 
	 * @return
	 */
	private void darColor(Carta carta) {

		// Condiciones salida del while
		boolean asignado = false;
		int loop = 0;
		int maxLoop = 30;

		while (!asignado && loop < maxLoop) {

			int numAleatorio = crearNumAleatorio(0, 8);
			ColorCarta colorCarta = colores.get(numAleatorio);
			Color color = colorCarta.getColor();
			int colorCartaRestantes = colorCarta.getTotal();

			// Assignar color si hay disponible (max 2)
			if (colorCartaRestantes > 0) {

				colorCarta.setTotal(colorCartaRestantes - 1);
				carta.setBackground(color);

				asignado = true;
			}

			loop++;
		}

	}

	/**
	 * Crear cartas y añadimos al array de cartas
	 */
	public void crearCartas() {
		// Posicion casillas x
		int x = 0;
		// Posicion casillas y
		int y = 0;
		for (int i = 0; i < 16; i++) {
			Carta carta = new Carta(this);
			if (i > 0 && i % 4 == 0) {
				x = 0;
				y = y + 120 + 10;
			}
			carta.setBounds(120 * x + 40 + (10 * x), y + 30, 120, 120);
			darColor(carta);

			x++;

			// Añadir carta al arryList
			cartas.add(carta);

		}
	}
	
	/**
	 * Dar la vuelta a las cartas para taparlas
	 */
	public void taparCartas() {
		

		for (int i = 0; i < cartasGiradas.size(); i++) {
			Carta carta = cartasGiradas.get(i);
//			carta.setGirada(false);
//			carta.setSelected(true);
//			cartasGiradas.em
		}

		
	}
	
	public void comprobarGiradas() {
		if (cartasGiradas.size() > 3) {
			System.out.println("taparcartas");
			taparCartas();
		} else {
			System.out.println("no tapar cartas");
		}
	}
	
	public void sumarCartaGirada(Carta carta) {
		cartasGiradas.add(carta);
	}

}
