package interfazGraficaEjemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrimeraGUI extends JFrame //al heredar de jframe la ventana la tiene oculta.
{
	JTextField txtinicio = new JTextField(40);  //creo el campo de texto. 40 es la longuitid maxima del campo
	JTextField txtdestino = new JTextField(40);

	public PrimeraGUI()
	{
		super("Mi primera ventana");
		setDefaultCloseOperation(EXIT_ON_CLOSE);  	//al cerrar la ventana se cierra el programa
		setLayout(new BorderLayout());				//debe ir en el constructor. No debe ir fuera
		
		txtinicio.setBackground(Color.BLUE);		//color de fondo
		txtinicio.setForeground(Color.WHITE);		//parte por delante del background. Se susa para el color de la letra
		txtinicio.setEditable(true);				// es editable el campo de texto. Por defecto es true
		
		
		txtdestino.setBackground(Color.DARK_GRAY);		
		txtdestino.setForeground(Color.ORANGE);		
		txtdestino.setEditable(false);				//campo de texto no editable
		
		JButton	boton = new JButton("COPIAR");		//texto que aparece en el boton 
		 /*
		boton.addActionListener(new ActionListener()	//ActionListener es una interfaz. Hacemos que el boton escuche eventos
		{
			public void actionPerformed(ActionEvent e)	//metodo que hay que implementar en la intrfaz. Es lo que hace el boton
			{
				String texto = txtinicio.getText();
				txtdestino.setText(texto);
			}
		}
		);
		*/
		
		boton.addActionListener(new AccionBoton());		//otra forma de hacer el boton
		
		JPanel panel = new JPanel();				//se crea el panel para meter los elementos anteriores
		panel.setLayout(new GridLayout(1,3));		//se crea el gridlayout de una fila y tres columnas
		
		panel.add(txtinicio);						//los componentes estan en el panel
		panel.add(boton);
		panel.add(txtdestino);
		
		add(panel,BorderLayout.CENTER);									//panel añadido a la ventana
		setSize(600, 80);							//tamaño de la ventana
		setBackground(Color.BLACK);
		setLocationRelativeTo(null); 				//coloca la ventana. null la coloca en el centro de la pantalla mas o menos
		setResizable(false); 						//el usuario no puede redimensionar la venatana
		setVisible(true); 							//hace la ventana visible
	}
	
	public static void main(String[] args) 
	{
		PrimeraGUI obj = new PrimeraGUI();
		//System.out.println("Hola");
	}

	class AccionBoton implements ActionListener		//clase interna de PrimeraGUI
	{
		public void actionPerformed(ActionEvent e)
		{
			String texto = txtinicio.getText();
			txtdestino.setText(texto);
		}
	}
}//fin clase principal


