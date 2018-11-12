package combinado1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MenuCartas extends JFrame
{
	private static final long serialVersionUID = 1L;
	private Button b0,b1,b2, b3, b4, b5, b6, b7, b8;
	
	public MenuCartas()
	{
		super("MenuCartas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		Panel botonera = _crearBotonera();
		add(botonera, BorderLayout.CENTER);
	}
	private Panel _crearBotonera()
	{
		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
                b0.addActionListener(new EscuchaBoton());
                b1.addActionListener(new EscuchaBoton());
                b2.addActionListener(new EscuchaBoton());
                b3.addActionListener(new EscuchaBoton());
                b4.addActionListener(new EscuchaBoton());
                b5.addActionListener(new EscuchaBoton());
                b6.addActionListener(new EscuchaBoton());
                b7.addActionListener(new EscuchaBoton());
                b8.addActionListener(new EscuchaBoton());
		
		Panel p = new Panel(new GridLayout(3,3));
		
		p.add(b0);
		p.add(b1);
		p.add(b2);
		
		p.add(b6);
		p.add(b7);
		p.add(b8);
		
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
                setSize(300,300);
                
		return p;
	}
        class EscuchaBoton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Carta nuevo = new Carta();
            nuevo.setVisible(true);
        }
        }
	public static void main(String[] args) 
	{
		MenuCartas l1 = new MenuCartas();
		l1.setVisible(true);
                l1.setResizable(true);
	}
}
