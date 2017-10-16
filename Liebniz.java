import java.util.Scanner;
public class Leibniz{
    public static void main (String [] args){
       Scanner lector = new Scanner (System.in);
       int lim,cont=0,term=1,res=0,total=0;
       System.out.println("¿Cuantos terminos quieres que definan pi ");
       lim=lector.nextInt();
       while(cont<=lim){
        res=1/term;
        term*=-1;
        term++;
        
       } 
       res*=4;
       System.out.println(res);
    }
}