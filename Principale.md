# Java
Java

/**
 *
 * @author Francesco
 */

public class Principale {
public static void main(String[] args) {

Carta c1 =new Carta ();
Carta c2 =new Carta ();   
Carta c3 =new Carta ();
c2.inserimentoCarte(2, 5);
c1.inserimentoCarte(1, 8);
//c3.inserimentoCarte(3, 2);

        System.out.println("c1 = "+c1+"     c2 = "+c2);
        Mazzo M=new Mazzo();
          M.caricaMazzo();
        M.caricaMazzo();
        M.scambia(1,2);
        M.visualizzaMazzo();
System.out.println("\nc1 = "+c1+"     c2 = "+c2);

 /*   Mazzo M=new Mazzo(); 
    M.caricaMazzo(); 
    M.visualizzaMazzo();
    
      //  System.out.println("\n\n\n\n");
    M.mescolaMazzo();
    M.visualizzaMazzo();*/

        }
}
