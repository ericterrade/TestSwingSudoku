package com.eric.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre2 extends JFrame {
	private JButton bouton = new JButton("Mon bouton");
	private JPanel conteneur= new JPanel();
	
	public Fenetre2() {
		JFrame maFenetre1 = new JFrame();
		setTitle("Ma fenêtre SWING");
		setSize(400,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		conteneur.add(bouton);
		
		setContentPane(conteneur);
	}
}
