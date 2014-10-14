/**
 *
 * @author Luigi
 */
import java.util.Scanner;
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int x;
    float risultato;
    Scanner input1= new Scanner(System.in);
    Scanner input2= new Scanner(System.in);
    Scanner input3= new Scanner(System.in);
    Scanner sc= new Scanner(System.in);
    Calcolatrice c1;
    System.out.println("Inserisci il primo numero: ");
    float numero1=input1.nextFloat();
    System.out.println("Inserisci il secondo numero: ");
    float numero2=input2.nextFloat();
    c1=new Calcolatrice(numero1, numero2);
    do{
    System.out.println("1. SOMMA ");
    System.out.println("2. SOTTRAZIONE ");
    System.out.println("3. MOLTIPLICAZIONE ");
    System.out.println("4. DIVISIONE ");
    System.out.println("Inserire l'operazione desiderata: ");
    x=input3.nextInt();
    switch (x) {
        case 1: risultato=c1.Somma(); 
        System.out.println("La somma tra i due numeri è: " +risultato);
        System.out.print("Premi invio per continuare. ");
        sc.nextLine();
        for (int i=0;i<50; ++i) System.out.println();
        break;
        case 2: risultato=c1.Sottrazione(); 
        System.out.println("La sottrazione tra i due numeri è: " +risultato);
        System.out.print("Premi invio per continuare. ");
        sc.nextLine();
        for (int i=0;i<50; ++i) System.out.println();
        break;
        case 3: 
        risultato=c1.Moltiplicazione();
        System.out.println("La moltiplicazione tra i due numeri è: " +risultato);
        System.out.print("Premi invio per continuare. ");
        sc.nextLine();
        for (int i=0;i<50; ++i) System.out.println();
        break;
        case 4: risultato=c1.Divisione();
        System.out.println("La divisione tra i due numeri è: " +risultato);
        System.out.print("Premi invio per continuare. ");
        sc.nextLine();
        for (int i=0;i<50; ++i) System.out.println();
        break;
            
    }
    
    } 
    while (x!=0);

}
