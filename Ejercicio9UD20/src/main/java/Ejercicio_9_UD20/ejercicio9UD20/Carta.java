package Ejercicio_9_UD20.ejercicio9UD20;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class Carta extends JToggleButton {

	/*
	 * Attributes
	 */
	private boolean mostrada = false;
	// Color asignado
	private Color color;
	public Controlador controlador;

	/*
	 * Contructor
	 */
	public Carta(Controlador controlador) {
		this.controlador = controlador;
		this.setBackground(Color.BLACK);
		// Dar apariencia de girada. Al girar se verá el color de background
		this.setSelected(true);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!mostrada) {
					mostrarCarta(); // girada se vuelve true
					controlador.anadirCartaGirada((Carta)e.getSource());
				}
				controlador.comprobar();		
			}

		});
	}

	/**
	 * @return the girada
	 */
	public boolean isGirada() {
		return mostrada;
	}

	/**
	 * @param girada the girada to set
	 */
	public void setGirada(boolean girada) {
		this.mostrada = girada;
	}

	// Methods

	// Mostrar carta
	private void mostrarCarta() {
		mostrada = true;
		setEnabled(false);
		setSelected(false);
	}
	// Tapar carta
	private void taparCarta() {
		mostrada = false;
		setEnabled(true);
		setSelected(true);
	}
}
