import java.util.Scanner;
public class MenosMas{
    public static void main (String [] args){
        Scanner lector = new Scanner (System.in);
        int num1,num2,num3;
        System.out.println("Dame el primer número");
        num1=lector.nextInt();
        System.out.println("Dame el segundo número");
        num2=lector.nextInt();
        System.out.println("Dame el tercer número");
        num3=lector.nextInt();
        
        if (num1>num2 && num1<num3){
                System.out.println(num2+" "+num1+" "+num3);

        }
        else{
            if(num1>num3 && num1<num2){
                System.out.println(num3+" "+num1+" "+num2);
            }
            else{
                if (num2>num3 && num2<num1){
                    System.out.println(num3+" "+num2+" "+num1);
                }
                else{
                    if (num2>num1 && num2<num3){
                        System.out.println(num1+" "+num2+" "+num3);
                    }
                    else{
                        if (num3>num1 && num3<num2){
                            System.out.println(num1+" "+num3+" "+num2);
                        }
                        else{
                            if(num3>num2 && num3<num1){
                                System.out.println(num2+" "+num3+" "+num1);
                            }
                        }
                    }
                }
            }
        }
    }
}
/*
Diegos-Air:ITC diegomorenoacevedo$ java MenosMas
Dame el primer número
100
Dame el segundo número
1000
Dame el tercer número
1
1 100 1000
*/