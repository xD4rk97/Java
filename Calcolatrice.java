
/**
 * @author xD4rk97
 */
public class Calcolatrice {
float numero1;
float numero2;
public Calcolatrice (float numero1, float numero2){
this.numero1=numero1;
this.numero2=numero2;
}
public void setNumero1(float numero1){
this.numero1=numero1;
}   
public float getNumero1 () {
return numero1;
}
public void setNumero2(float numero2){
this.numero2=numero2;    
}
public float getNumero2(){
return numero2;    
}
public float Somma(){
float risultato= numero1+numero2;
return risultato;
}
public float Sottrazione(){
    float risultato;
if (numero1>=numero2) {
    risultato=numero1-numero2;
}
else 
    risultato=numero2-numero1;
return risultato;
}
public float Moltiplicazione(){
float risultato=numero1*numero2;
return risultato;
}
public float Divisione(){
float risultato;
if (numero1>=numero2) {
    risultato=numero1/numero2;
}
else 
    risultato=numero2/numero1;
return risultato;    
}
}
