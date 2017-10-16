import java.util.Scanner;
public class While1{
    public static void main (String []args){
        int n;
        Scanner lector= new Scanner (System.in);
        n=lector.nextInt();
        System.out.printf("La sumatoria es %d. ", Sumatoria(n));
        System.out.printf("%nLa factorial es %d. ", factorial(n));
        System.out.printf("%nLa factorial 1 es %d. ", factorial1(n)," %n");
    }
    public static int Sumatoria(int limite){
        int sumatoria=0,cont=0;
        while(cont<=limite){
            sumatoria+=cont;
            cont++;
            
        }
        return sumatoria;
    }
    public static int factorial(int n){
        int factorial=1,cont=1;
        while(cont<=n){
            factorial*=cont;
            cont++;
            
        }
        return factorial;
    }
    public static int factorial1(int n){
        int factorial=1,cont=1;
        do{
            factorial*=cont;
            cont++;
        }while(cont<=n);
        return factorial;
    }
}