# Java
Java
import java.lang.Math;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
 
public class Mazzo {
    private Carta C[]; 
    protected final int MAX=40;
  
    
public Mazzo(){
    C=new Carta[MAX];
    
}

public void caricaMazzo() {
int b=0; 
    for(int i=1; i<5; i++){
        for(int a=1; a<11; a++){ 
            C[b]=new Carta();
            C[b].inserimentoCarte(i, a);
            b++; 
    }
}
}

public void mescolaMazzo() {
int variabile=0 ; //variabile1 = 0 
    for(int i=0; i<MAX; i++){
        variabile=(int)Math.random()*40;
//        variabile1=(int)Math.random()*40;
       // if(C[i]!=null || C[variabile]!=null)
        //{   
         //   CC.copiaCarta(C[i]); 
            C[i].copiaCarta(C[variabile]); 
           // C[variabile].copiaCarta(CC);
            


        //} 
    }
}

public void visualizzaMazzo() {
    for(int i=0; i<MAX; i++)
    {
        System.out.println(C[i].toString()); 
    }
}

public void scambia(int i , int a)
{
   
   
Carta c =new Carta ();

        c.copiaCarta(C[i]);
        C[i].copiaCarta(C[a]);
        C[a].copiaCarta(c);
}
        
}
