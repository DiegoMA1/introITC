import java.util.Scanner;
public class MenorMayor{
    public static void main (String [] args){
        Scanner lector = new Scanner (System.in);
        int num1,num2,num3;
        System.out.println("Dame el primer número");
        num1=lector.nextInt();
        System.out.println("Dame el segundo número");
        num2=lector.nextInt();
        System.out.println("Dame el tercer número");
        num3=lector.nextInt();
        if(num1<num2){
            if(num1<num3){
                if(num2<num3){
                    System.out.println(num1);
                    System.out.println(num2);
                    System.out.println(num3);
                }//if
                else{
                    System.out.println(num1);
                    System.out.println(num3);
                    System.out.println(num2);
                }//else
            }//if
            else{
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
            }//else
        }
        else{
            if(num2<num3){
                if(num3<num1){
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);
                }//else
                else{
                    System.out.println(num2);
                    System.out.println(num1);
                    System.out.println(num3);
                }//else
            }//if
        }//else
    }//main
}//class