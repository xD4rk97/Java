/** *
@author Francesco , Giorgio, Luigi. */
import javax.swing.ImageIcon;
public class Carta {

  private int cont;   // il contatore per l'output (chiesto da Lugi), i numeri sono da 0 a 39.
  int valore; 
  String seme;
  public ImageIcon figura;
public Carta() {}

public void inserimentoCarte(int a, int b , int c) { 
    switch(a)
{ 
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
cont=c;
figura=new ImageIcon("percorso alle carte");

//assegnazione contatore del contatore 
}

@Override public String toString() { return valore +" "+ seme+" "+cont+"\n" ; }

public void copiaCarta(Carta c) { seme=c.seme; valore=c.valore; cont=c.cont;// copia contatore
} }
