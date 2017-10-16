import java.util.*;
public class Aleatorios{
    public static void main (String [] args){
        Random numerosAleatorios = new Random();
        int numero;
        for(int i=1;i<=50;i++){
            System.out.println("El número es "+numerosAleatorios.nextInt(10));
            numero=numerosAleatorios.nextInt(21)-10;
            System.out.println("El número es "+numero);

        }
        double numeroDouble;
        for(int i=1;i<=50;i++){
            numeroDouble=numerosAleatorios.nextDouble()*10;
            System.out.printf("%.3f",numeroDouble); //Tener solo 3 decimales
        }
        int [] A1=new int [100];
        for(int i=0;i<A1.length;i++){
            A1[i]=numerosAleatorios.nextInt();
        }
        for (int i=0;i<=A1.length;i++){
            System.out.print(A1[i]);
        }
    }
}