package Proyect0;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vent extends JFrame{
	
	JFrame Principal;
	JPanel pan;
	JButton boton,butonC;
	JTextField palabra;
	JLabel holis;
	
	
	
	public Vent() {
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setTitle("Saludito");
		
	
		
		Iniciar();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public void  Iniciar() {
		AgPan();
		AgBot();
		AddJt();
		
		
	}
	
	public void AgPan() {
		pan= new JPanel();
		
		pan.setLayout(null);
		pan.setBackground(Color.pink);
		AgLab();
		this.getContentPane().add(pan);
		
	}
	
public void AgLab() {
		
		JLabel etip1= new JLabel("Quieres un saludo?");
		JLabel etip2= new JLabel();
		JLabel etiq3= new JLabel();
		
		
		etip1.setForeground(Color.WHITE);
		etip1.setBounds(180,0,150,30);
		etip1.setFont(new Font("arial",1,14));
		
		
		
		etip2.setText("Dime tu nombre:)");
		etip2.setFont(new Font("arial",0,14));;
		etip2.setForeground(Color.WHITE);
		etip2.setBounds(10,40,130,30);
		
		
		holis= new JLabel();
		holis.setBounds(10,150,200,40);
		holis.setFont(new Font("arial",1,24));
		pan.add(holis);
		
		etiq3.setForeground(Color.WHITE);
		etiq3.setText("llevate una ->");
		etiq3.setFont(new Font("arial",0,14));
		etiq3.setBounds(10,190,160,40);
		
		pan.add(etip1);
		pan.add(etip2);
		pan.add(etiq3);
		
		
		
	}

public void AddJt() {
	palabra= new JTextField();
	palabra.setBounds(140,40,130,30);
	pan.add(palabra);
	
}
	
	
	public void AgBot() {
		
		boton= new JButton();
		boton.setText("sorpresa");
		boton.setBounds(100,200,100,20);
		boton.setBackground(Color.WHITE);
		pan.add(boton);
		
		butonC= new JButton();
		butonC.setText("Haz click aqui");
		butonC.setBounds(140,80,130,20);
		butonC.setBackground(Color.WHITE);
		pan.add(butonC);
		
		
		MouseListener();
	}
	
	
	
	public void saludo() {
		repaint();
		holis.setText("Hola!!!!! "+ palabra.getText());
		
	}
	
	public void Michi() {
		repaint();
		JLabel tkm= new JLabel();
		tkm.setText("TKM");
		tkm.setBounds(230,160,100,40);
		
		
		ImageIcon back= new ImageIcon("michi.jpg");
		JLabel fondo= new JLabel();
		fondo.setIcon(new ImageIcon(back.getImage().getScaledInstance(137,256,Image.SCALE_SMOOTH)));
		fondo.setBounds(230,190,137,256);
		
		pan.add(fondo);
		pan.add(tkm);
	}
		
		public void MouseListener() {
			MouseListener accion= new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					
					Michi();
							
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			};
			boton.addMouseListener(accion);
			
		
			
			
			
			MouseListener Action= new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
				
					
					saludo();
				
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			};
			butonC.addMouseListener(Action);
			
		
		
		
	}

}
