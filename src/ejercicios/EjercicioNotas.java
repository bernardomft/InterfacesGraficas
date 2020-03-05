package ejercicios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjercicioNotas extends JFrame
{

	JLabel notas = new JLabel("Asignatura");
	JLabel cal = new JLabel("Calificación");
	JLabel estado = new JLabel("Aprobado/Suspenso");
	JLabel media = new JLabel("Media");
	
	JLabel bases = new JLabel("Bases de datos");
	JLabel entornos = new JLabel("Entornos de desarollo");
	JLabel marcas = new JLabel("Lenguajes de Marcas");
	JLabel progra = new JLabel("Programación");
	JLabel ingles = new JLabel("Inglés");
	JLabel fol = new JLabel("Formación y Orientación Laboral");
	JLabel sistemas = new JLabel("Bases de datos");
	
	JTextField txtbases = new JTextField(40);
	JTextField txtentornos = new JTextField(40);
	JTextField txtmarcas = new JTextField(40);
	JTextField txtprogra = new JTextField(40);
	JTextField txtingles = new JTextField(40);
	JTextField txtfol = new JTextField(40);
	JTextField txtsistemas = new JTextField(40);
	
	JTextField txtmedia = new JTextField(40);
	JTextField txtotal = new JTextField(40);
	
	JTextField aprobadoBases = new JTextField(40);
	JTextField aprobadoEntornos = new JTextField(40);
	JTextField aprobadoMarcas = new JTextField(40);
	JTextField aprobadoProgra = new JTextField(40);
	JTextField aprobadoIngles = new JTextField(40);
	JTextField aprobadoFol = new JTextField(40);
	JTextField aprobadoSistemas = new JTextField(40);
	
	JButton	boton1 = new JButton("MEDIA");	
	JButton	boton2 = new JButton("APROBADO/SUSPENSO");	
	
	JPanel panel = new JPanel();
	
	public EjercicioNotas()
	{
		super("Calificaciones");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		aprobadoBases.setEditable(false);
		aprobadoEntornos.setEditable(false);
		aprobadoMarcas.setEditable(false);
		aprobadoProgra.setEditable(false);
		aprobadoIngles.setEditable(false);
		aprobadoFol.setEditable(false);
		aprobadoSistemas.setEditable(false);
		txtotal.setEditable(false);
		txtmedia.setEditable(false);
		
		boton1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(txtbases.getText().isEmpty() || txtentornos.getText().isEmpty() || txtmarcas.getText().isEmpty() || 
						txtprogra.getText().isEmpty() ||  txtingles.getText().isEmpty() || txtfol.getText().isEmpty() || 
						txtsistemas.getText().isEmpty())
				{
					JOptionPane.showConfirmDialog(panel, "Introduce todas las calificaciones, MELÓN", "log", JOptionPane.CLOSED_OPTION);
				}
				else
				{
					double mediaDouble = (Double.parseDouble(txtbases.getText()) + Double.parseDouble(txtentornos.getText()) + 
							Double.parseDouble(txtmarcas.getText()) + Double.parseDouble(txtprogra.getText()) + 
							Double.parseDouble(txtingles.getText()) + Double.parseDouble(txtfol.getText()) + 
							Double.parseDouble(txtsistemas.getText()))/7;
					mediaDouble = Math.round(mediaDouble * 100) / 100 ;
					txtmedia.setText(String.valueOf(mediaDouble));
				}
			}
		}
		);
		
		boton2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int suspenso = 0;
				int aprobado = 0;
				
				if(txtbases.getText().isEmpty() || txtentornos.getText().isEmpty() || txtmarcas.getText().isEmpty() || 
						txtprogra.getText().isEmpty() ||  txtingles.getText().isEmpty() || txtfol.getText().isEmpty() || 
						txtsistemas.getText().isEmpty())
				{
					JOptionPane.showConfirmDialog(panel, "Introduce todas las calificaciones, MELÓN", "log", JOptionPane.CLOSED_OPTION);
				}
				else
				{
				
					if(Double.parseDouble(txtbases.getText()) >= 5)
					{
						aprobadoBases.setText("APROBADO");
						aprobado +=1;
					}
					else
					{
						aprobadoBases.setText("SUSPENSO");
						suspenso += 1;
					}
					
					if(Double.parseDouble(txtentornos.getText()) >= 5)
					{
						aprobadoEntornos.setText("APROBADO");
						aprobado +=1;
					}
					else
					{
						aprobadoEntornos.setText("SUSPENSO");
						suspenso += 1;
					}
					
					if(Double.parseDouble(txtmarcas.getText()) >= 5)
					{	
						aprobadoMarcas.setText("APROBADO");
						aprobado +=1;
					}
					else
					{	
						aprobadoMarcas.setText("SUSPENSO");
						suspenso += 1;
					}
					
					if(Double.parseDouble(txtprogra.getText()) >= 5)
					{
						aprobadoProgra.setText("APROBADO");
						aprobado +=1;
					}
					else
					{
						aprobadoProgra.setText("SUSPENSO");
						suspenso += 1;
					}
					
					if(Double.parseDouble(txtingles.getText()) >= 5)
					{
						aprobadoIngles.setText("APROBADO");
						aprobado +=1;
					}
					else
					{
						aprobadoIngles.setText("SUSPENSO");
						suspenso += 1;
					}
					
					if(Double.parseDouble(txtfol.getText()) >= 5)
					{	
					
						aprobadoFol.setText("APROBADO");
						aprobado +=1;
					}
					else
					{
						aprobadoFol.setText("SUSPENSO");
						suspenso += 1;
					}
					
					if(Double.parseDouble(txtsistemas.getText()) >= 5)
					{
						aprobadoSistemas.setText("APROBADO");
						aprobado +=1;
					}
					else
					{
						aprobadoSistemas.setText("SUSPENSO");
						suspenso += 1;
					}
					txtotal.setText("TOTAL:  Aprobados: " + aprobado + " // Suspensos: " + suspenso);
					JOptionPane.showConfirmDialog(panel, "Operación realizda con éxito", "log", JOptionPane.CLOSED_OPTION);
				}
				
			}
		});
		
		panel.setLayout(new GridLayout(10,3));
		
		panel.add(notas);
		panel.add(cal);
		panel.add(estado);
		
		panel.add(bases);
		panel.add(txtbases);
		panel.add(aprobadoBases);
		
		panel.add(entornos);
		panel.add(txtentornos);
		panel.add(aprobadoEntornos);
		
		panel.add(marcas);
		panel.add(txtmarcas);
		panel.add(aprobadoMarcas);
		
		panel.add(progra);
		panel.add(txtprogra);
		panel.add(aprobadoProgra);
		
		panel.add(ingles);
		panel.add(txtingles);
		panel.add(aprobadoIngles);
		
		panel.add(fol);
		panel.add(txtfol);
		panel.add(aprobadoFol);
		
		panel.add(sistemas);
		panel.add(txtsistemas);
		panel.add(aprobadoSistemas);
		
		panel.add(media);
		panel.add(txtmedia);
		panel.add(txtotal);
		
		panel.add(new JLabel(""));
		panel.add(boton1);
		panel.add(boton2);
		
		add(panel, BorderLayout.CENTER);
		//setSize(1000,1000);
		pack();
		setBackground(Color.BLACK);
		setLocationRelativeTo(null); 				
		setResizable(false); 						
		setVisible(true); 	
	}
	public static void main(String[] args) 
	{
		EjercicioNotas obj = new EjercicioNotas();

	}
}