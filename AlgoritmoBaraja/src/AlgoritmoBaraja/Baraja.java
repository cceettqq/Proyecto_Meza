package AlgoritmoBaraja;
public class Baraja 
{
    private Carta cartas[];
    private int posSigCarta;
    
    public static final int Num_cartas=40;
    
    public Baraja()
    {
        this.cartas= new Carta[Num_cartas];
        this.posSigCarta=0;
        crearBaraja();
    }
    
    private void crearBaraja()
    {
        String[] img= Carta.IMG;
        for(int i=0;i<img.length;i++)
        {
            for(int j=0;j<Carta.lim_img;j++)
            {
                if ( !(j == 7 || j == 8) ) 
                {
                    if (j>=9) 
                    {
                        cartas[((i * (Carta.lim_img - 2)) + (j - 2))] = new Carta(j + 1, img[i]);
                    } 
                    else 
                    {
                        cartas[((i * (Carta.lim_img - 2)) + j)] = new Carta(j + 1, img[i]);
                    }
                }
            }
        
         }
    }
    
    public void Barajar()
    {
        int posAleatoria = 0;
        Carta c;
        
        for (int i = 0; i < cartas.length; i++) 
        {
            posAleatoria = MyF.generaNumeroEnteroAleatorio(0, Num_cartas - 1);
            c = cartas[i];
            cartas[i] = cartas[posAleatoria];
            cartas[posAleatoria] = c;
         }
        
        this.posSigCarta = 0;
    }
    
    
     public void mostrarBaraja() 
     {
            for (int i = posSigCarta; i < cartas.length; i++) 
            {
                System.out.println(cartas[i]);
            }
     }
    
}
