import java.util.*;
public class While2{
    public static void main (String [] args ){
        double lado;
        String respuesta="si";
        Scanner lector = new Scanner (System.in);
        while(respuesta.equalsIgnoreCase("Si")){
            System.out.println("Dame el lado de un cuadrado para calcular su área");
            lado= lector.nextDouble();
            lector.nextLine();

            System.out.printf("El area es %.2f %n",lado*lado);
            System.out.println("Quires hacerlo de nuevo");
            respuesta=lector.nextLine();
        }
    }
}