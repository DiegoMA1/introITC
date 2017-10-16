import java.util.*;
public class Metodo1{
    public static void main (String []args){
        int edad=0;
        String nombre="";
        Scanner lector = new Scanner (System.in);
        System.out.println("¿Cual es tu nombre?");
        nombre=lector.nextLine();
        System.out.println("¿Cual es tu edad?");
        edad=lector.nextInt();
        imprime(nombre,edad);
    }
    public static void imprime(String nom, int edad){
        System.out.printf("Hola %s tu edad es %d%n", nom,edad); //La coma sirve para poner los parametros que seran sustituidos
                                                              //%n es para salto de linea
                                                              //%s es para sustituir por un String

    }
}