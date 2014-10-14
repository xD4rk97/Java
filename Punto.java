/**
 *
 * @author xD4rk97
 */
import java.util.Scanner;
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Punto a,o;
    float x,y,distanza;
    Scanner input1=new Scanner(System.in);
    System.out.println("Inserire la coordinata x del punto A: ");
    x=input1.nextFloat();
    System.out.println("Inserire la coordinata y del punto A: ");
    y=input1.nextFloat();
    a=new Punto(x,y);
    o=new Punto();
    distanza=(float) Math.sqrt(Math.pow((a.x-o.x), 2)+Math.pow((a.y-o.y), 2));
    System.out.println("La distanza del punto A dall'origine è: " +distanza);
    }
}
