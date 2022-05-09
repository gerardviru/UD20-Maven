package Ejercicio_9_UD20.ejercicio9UD20;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class Carta extends JToggleButton {

	/*
	 *  Attributes
	 */
	private boolean girada = false;
	// Color asignado
	private Color color;
	
	/*
	 * Contructor
	 */
	public Carta() {
		this.setBackground(Color.BLACK);
		// Dar apariencia de girada. Al girar se verá el color de background
		this.setSelected(true);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				girarCarta();
			}


		});
	}


	/**
	 * @return the girada
	 */
	public boolean isGirada() {
		return girada;
	}


	/**
	 * @param girada the girada to set
	 */
	public void setGirada(boolean girada) {
		this.girada = girada;
	}
	
	// Methods
	
	// Toggle estado girada
	private void girarCarta() {
		this.girada = !this.girada;
	}
}
