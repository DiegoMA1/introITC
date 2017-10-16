import java.util.Scanner;
public class masPeque {
    public static void main (String [] args){
        double num1, num2, num3;
        Scanner lector = new Scanner (System.in);
        System.out.println("Dame el primer número: ");
        num1=lector.nextDouble();
        System.out.println("Dame el segundo número: ");
        num2=lector.nextDouble();
        System.out.println("Dame el tercer número: ");
        num3=lector.nextDouble();
        System.out.println("El número más pequeño es "+elMasPeque(num1, num2, num3));
    }
    public static double elMasPeque(double a,double b, double c){
        double p=0.0;
        if (a<b && a<c){
            p=a;
        }
        else{
            if (b<a && b<c){
                p=b;
            }
            else{
                if (c<b && c<a){
                    p=c;
                }
            }
        }
        return (p);

    }
}
/*
Diegos-Air:ITC diegomorenoacevedo$ java masPeque
Dame el primer número:
654
Dame el segundo número:
34
Dame el tercer número:
9
El número más pequeño es 9.0
*/