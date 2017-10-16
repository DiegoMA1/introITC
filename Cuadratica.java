import java.util.Scanner;
public class Cuadratica{
    public static void main (String [] args) {
        Scanner lector=new Scanner (System.in);
        double a,b,c;
        System.out.println("Dame los valores de a b y c de tu función cuadratica");
        System.out.println("a: ");
        a=lector.nextInt();
        System.out.println("b: ");
        b=lector.nextInt();
        System.out.println("c: ");
        c=lector.nextInt();
        Raices(a, b, c);
    }
    public static void Raices(double a,double b,double c){
        double x1=0,x2=0,d;
        d=((b*b)-4*a*c);
        if(d<=0){
            d*=-1;
            d=Math.sqrt(d);
            int d1,b1,a1;
            d1=(int) d;
            b1=(int) b;
            a1=(int) a;
            b1=b1/2*a1;
            d1/=2*a1;
            System.out.println("x1= ("+(-b1)+"+"+d1+"i)");
            System.out.println("x1= ("+(-b1)+"+"+(-d1)+"i)");
        }
        else{
        x1=(-b+(Math.sqrt(b*b-(4*a*c))))/2*a;
        x2=(-b-(Math.sqrt(b*b-(4*a*c))))/2*a;
        System.out.println("Las raices de tu función cuadratica son x1= "+x1+" y x2= "+x2);
        }
        
    }
} 
/*
Diegos-Air:ITC diegomorenoacevedo$ java Cuadratica
Dame los valores de a b y c de tu función cuadratica
a:
1
b:
2
c:
2
x1= (-1+1i)
x1= (-1+-1i)
*/

