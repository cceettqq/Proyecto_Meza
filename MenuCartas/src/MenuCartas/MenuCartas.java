package MenuCartas;
import java.awt.*;
import javax.swing.JFrame;

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
		
		return p;
	}
	public static void main(String[] args) 
	{
		MenuCartas l1 = new MenuCartas();
		l1.setBounds(0, 0, 360, 480);
		l1.setVisible(true);
	}
}
