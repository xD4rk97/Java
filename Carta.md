# Java
Java
/**
 *
 * @author Francesco
 */
public class Carta {
    
    private int valore; 
    private String seme; 
    
public Carta() {}

public void inserimentoCarte(int a, int b) {
    switch(a) {
       case 1: 
           seme="Mazze";
           break; 
       case 2:
           seme="Denari";
           break; 
       case 3: 
           seme="Coppe";
           break; 
       case 4: 
           seme="Spade";
           break; 
   }
   valore=b; 
}

@Override
public String toString() {
    return valore +" "+ seme; 
}
public void copiaCarta(Carta c)
{        
seme=c.seme;
valore=c.valore;


}
}
