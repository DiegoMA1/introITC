import java.util.*;
public class TA2{
    public static void main (String [] args){
        int [] A1 = {5,7,8,9,62,4,3,1,12,56,0,72,36};
        Scanner lector = new Scanner (System.in);
        int res;
        boolean check=true;
        System.out.println("¿Que número quieres buscar en el arreglo? ");
        res=lector.nextInt();
        for (int cont=0;cont<A1.length;cont++){
            if(res==A1[cont]){
                System.out.printf("El número %d se encuentra en la posición %d",res,cont);
                check=true;
                break;
                
            }
            else{
                check=false;
            }
        }
        if(check==false){
            System.out.println("Lo sentimos, ese número no se encuentra en tu arreglo \n ");
        }

    }
}