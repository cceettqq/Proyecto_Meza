package AlgoritmoBaraja;
public class Carta 
{
    private int numero;
    private String img;
    
    public static final String[] IMG={"hehe", "xd", "hoho","hihi"};
    public static final int lim_img=12;

    public Carta(int numero, String img) {
        this.numero = numero;
        this.img = img;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", img=" + img;
    }
}
