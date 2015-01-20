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
 * @author Francesco , Giorgio .
 */
 
    public class Mazzo { 
    
    private Carta C[]; 
    protected final int MAX=40;

public Mazzo()
 { 
    C=new Carta[MAX];

 }

public void caricaMazzo() 
{ 
   int b=0; 
   for(int i=1; i<5; i++)
    { 
        for(int a=1; a<11; a++)
         { 
           C[b]=new Carta(); 
           C[b].inserimentoCarte(i, a, b); 
           b++; 
         } 
       
     } 
 }

public void mescolaMazzo() 
{ 
  double c=0 ;
  int b = 0  ; 
  int a = 0  ;
        for(int i=0; i<MAX; i++)
 { 
    
    c=Math.random()*40; //abbiamo deciso di castare la variabile in un secondo momento poichè genera errori
    a=(int) c;          //casting
    c=Math.random()*40;
    b=(int) c;
    if(C[a]!=null || C[b]!=null) 
     {
        scambia(a,b); 
     } 
    else
     {
        
     }
  }
}


public void visualizzaMazzo() 
{ 
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
