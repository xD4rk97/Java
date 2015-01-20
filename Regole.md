# Java
Java
//@Creata da Giorgio 

public class Regole {
    private final int MAX=2;
    private Carta mano[];
    
public Regole ()
{
    mano= new Carta[MAX];
}
    
public void pescaCarta(Mazzo m)  
    {
        int i;
        double a;
        mano[1]= new Carta ();
        for(;;)
        {
            a=Math.random()*40;
            i=(int) a;
    
            if(m.C[i]!= null)
        {
                mano[1].copiaCarta(m.C[i]);
                m.C[i]=null; 
                return;
        }
   
    }
}
       
public void pescaPerIndice(int i,Mazzo m )
    {
        if(m.C[i]!= null)
        {
            mano[0]= new Carta ();
            mano[0].copiaCarta(m.C[i]);
            m.C[i]=null;
        }
    }
        
public void visualizza ()
{
    int i ;
    
    for(i=0;i<MAX;i++)
        {
         System.out.println(mano[i].toString());
            
        }
}



}
