package Carta;
import java.awt.*;
import javax.swing.JFrame;

public class Carta extends JFrame
{
	private static final long serialVersionUID = 1L;
	private Button b0,b1,b2;
	public Carta()
	{
		super("CARTA");
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
	
		Panel p = new Panel(new GridLayout(3,1));
		
		p.add(b0);
		p.add(b1);
		p.add(b2);
		return p;
	}
	
	public static void main(String[] args) 
	{
		Carta l1 = new Carta();
		l1.setBounds(0, 0, 360, 480);
		l1.setVisible(true);
	}

}
