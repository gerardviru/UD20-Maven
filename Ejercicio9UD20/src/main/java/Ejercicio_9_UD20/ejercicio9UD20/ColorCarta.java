package Ejercicio_9_UD20.ejercicio9UD20;

import java.awt.Color;

public class ColorCarta {

	/*
	 * Se utiliza para asignar un color de carta y asegurar que el color no se
	 * asigna mas del total disponible
	 */

	/*
	 * Attributes
	 */
	private Color color;
	private int total = 2;

	public ColorCarta(Color color) {
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

}
