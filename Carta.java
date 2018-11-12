package combinado1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Carta extends JFrame
{
	private static final long serialVersionUID = 1L;
	private Button b0,b1,b2;
        public int con = 0;
	public Carta()
	{
		super("CARTA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		Panel botonera = _crearBotonera();
		add(botonera, BorderLayout.CENTER);
                setSize(300,300);
	}
	
	private Panel _crearBotonera()
	{
		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
                b0.addActionListener(new EscuchaBoton());
                b1.addActionListener(new EscuchaBoton());
                b2.addActionListener(new EscuchaBoton());
	
		Panel p = new Panel(new GridLayout(3,1));
		
		p.add(b0);
		p.add(b1);
		p.add(b2);
		return p;
	}
        class EscuchaBoton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (con == 0){
                System.out.println("Hola...");
                con++;
            }else{
                MenuCartas nuevo = new MenuCartas();
                nuevo.setVisible(true);
            }
        }
	
	public void main(String[] args) 
	{
		Carta l1 = new Carta();
		l1.setBounds(0, 0, 360, 480);
		l1.setVisible(true);
	}
        }

}
