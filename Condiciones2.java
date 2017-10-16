import java.util.Scanner;
public class Condiciones2{
    public static void main (String [] args){
        int opcion;
        Scanner lector = new Scanner (System.in);
        System.out.println("¿En que tarifa quieres viajar? (1-5)");
        opcion=lector.nextInt();
        switch(opcion){
            case 1:
            System.out.println("Tu tarifa es: $15274");
            break;
            case 2:
            System.out.println("Tu tarifa es: $15459");
            break;
            case 3:
            System.out.println("Tu tarifa es: $31337");
            break;
            case 4:
            System.out.println("Tu tarifa es: $45233");
            break;
            case 5: 
            System.out.println("Tu tarifa es: $82916");
            break;
            default:
            System.out.println("Esta tarifa no esta disponible");
            break;

        }
    }
}