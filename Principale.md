# Java
Java

/**
 * Sistemato il bottone e ora da una carta in out put fatto da giorgio
 * @author Francesco
 */
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.JButton;
import javax.swing.JFrame;
class Ascolto implements MouseListener {
     //  public void mousePressed(MouseEvent me, int a) {
        
    //}

    @Override
    public void mouseClicked(MouseEvent me) {
    JFrame frm=new JFrame("Estrazione carta");
    frm.setVisible(true);
    frm.setSize(300,400);
    JLabel carta=new JLabel(); 
    frm.add(carta);
    int a ;
    double b;
    b=Math.random()*40+1;
    a=(int) b;
    
    carta.setSize(100,90);
    carta.setIcon(Principale.M.C[a].figura);
    
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
      //To change body of generated methods, choose Tools | Templates.
    }
}
public class Principale extends Ascolto{

public static Mazzo M ;    
public static void main(String[] args) {
    int a;
    JFrame frm=new JFrame("Estrazione carta");
    double x;
    /*Mazzo*/M=new Mazzo();
    M.caricaMazzo();
    M.mescolaMazzo();
    frm.setVisible(true);
    frm.setSize(300,400);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   JButton bottone= new JButton("Estrai"); 
    JLabel carta=new JLabel(); 
    frm.add(carta);
    frm.add(bottone);
    
    Ascolto e=new Ascolto();
    bottone.addMouseListener(e);
    carta.setSize(100,90);
    x=Math.random()*40+1;
    a=(int)x;
    carta.setIcon(M.C[a].figura);
            }
}


