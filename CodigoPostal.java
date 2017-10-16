import java.util.Scanner;
public class CodigoPostal{
    public static void main (String [] args){
        String zip="0";
        char codigo = zip.charAt(0);
        Scanner lector = new Scanner (System.in);
        System.out.println("Dame el número postal");
        zip=lector.nextLine();
        switch (codigo){
            case '0':
            case '2':
            case '3':
            System.out.println("Tu codigo postal pertenece al este");
            break;
            case '4':
            case '5':
            case '6':
            System.out.println("Tu codigo postal pertenece al centro");
            break;
            case '7':
            System.out.println("Tu codigo postal pertenece al Sur");
            break;
            case '8':
            case '9':
            System.out.println("Tu codigo postal pertenece al Oeste");
            break;
        }
    }
}