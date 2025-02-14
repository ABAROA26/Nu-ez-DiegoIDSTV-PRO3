package Ventana;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Miventana extends JFrame{

	public Miventana() {
		
		JFrame ventana = new JFrame();
		
		ventana.setTitle("Programa");
		ventana.setVisible(true);
		ventana.setSize(500, 500);
		
		ventana.setLocationRelativeTo(null);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.setResizable(true);
		ventana.setMaximumSize(new Dimension(800,800));
		ventana.setMinimumSize(new Dimension(400,400));
		
	}

}
