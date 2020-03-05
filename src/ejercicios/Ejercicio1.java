package ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio1 extends JFrame
{

	JTextField txtinicio = new JTextField(40);
	JTextField txtdestino = new JTextField(40);
	
	
	public Ejercicio1()
	{
		super("Ejercicio 1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		txtinicio.setBackground(Color.BLUE);
		txtinicio.setForeground(Color.WHITE);
		
		txtdestino.setBackground(Color.BLACK);
		txtdestino.setForeground(Color.ORANGE);
		txtdestino.setEditable(false);
		
		JButton	boton1 = new JButton("COPIAR");	
		JButton	boton2 = new JButton("CAMBIAR COLORES");	
		
		boton1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String texto = txtinicio.getText();
				txtdestino.setText(texto);
				
			}
		});
		
		boton2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (txtdestino.getBackground().equals(Color.GREEN))
				{
					txtdestino.setBackground(Color.BLACK);
					txtdestino.setForeground(Color.ORANGE);
				}
				else
				{
				txtdestino.setBackground(Color.GREEN);
				txtdestino.setForeground(Color.white);
				}
			}
		});
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,3));
		
		panel.add(txtinicio);
		panel.add(boton1);
		panel.add(txtdestino);
		panel.add(new JLabel(""));
		panel.add(boton2);
		panel.add(new JLabel(""));
		
		add(panel, BorderLayout.CENTER);
		setSize(600,100);
		setBackground(Color.BLACK);
		setLocationRelativeTo(null); 				
		setResizable(false); 						
		setVisible(true); 	
	}
	public static void main(String[] args) 
	{
		Ejercicio1 obj = new Ejercicio1();

	}

}
