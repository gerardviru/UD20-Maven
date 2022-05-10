package Ejercicio5UD20.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class JFrame_Ejercicio5UD20 extends JFrame {

	private JPanel contentPane;
	private JTextField AreaTexto;

	/**
	 * Launch the application.
	 */
	public static void JFrame_Ejercicio5UD20() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_Ejercicio5UD20 frame = new JFrame_Ejercicio5UD20();
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
	public JFrame_Ejercicio5UD20() {
		setTitle("Ejercicio 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		AreaTexto = new JTextField();
		AreaTexto.setEditable(false);
		AreaTexto.setBounds(10, 107, 414, 20);
		contentPane.add(AreaTexto);
		AreaTexto.setColumns(10);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AreaTexto.setText("");
			}
		});
		btnLimpiar.setBounds(178, 164, 89, 23);
		contentPane.add(btnLimpiar);
		
		eventos();
	}
	
	public void eventos() {
		AreaTexto.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				AreaTexto.setText("MouseReleased");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				AreaTexto.setText("MousePressed");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				AreaTexto.setText("MouseExited");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				AreaTexto.setText("MouseEntered");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				AreaTexto.setText("MouseCliked");
				
				
				
			}
		});
	}
}
