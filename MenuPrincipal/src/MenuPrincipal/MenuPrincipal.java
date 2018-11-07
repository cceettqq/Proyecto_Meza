package MenuPrincipal;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;


import javax.swing.*;

public class MenuPrincipal extends JFrame
{
	private static final long serialVersionUID = 1L;
	private Button b0,b1;
	public MenuPrincipal()
	{
		super("Menu");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		Panel botonera = _crearBotonera();
		add(botonera, BorderLayout.CENTER);
	}
	
	private Panel _crearBotonera()
	{
		b0 = new Button("0");
		b1 = new Button("Salir");
		b1.addActionListener(new EscucharBoton());
		Panel p = new Panel(new GridLayout(2,1));
		
		p.add(b0);
		p.add(b1);
		return p;
	}
	public static void main(String[] args)
	{
		MenuPrincipal l1 = new MenuPrincipal();
		l1.setBounds(0, 0, 360, 480);
		l1.setVisible(true);
	}
}
