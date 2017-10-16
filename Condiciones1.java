import java.util.Scanner;
public class Condiciones1{
    public static void main (String [] args){
        int temperatura;
        String salida="";
        Scanner lector=new Scanner (System.in);
        System.out.println("¿Cuál es la temperatura actual del auto?");
        temperatura=lector.nextInt();
        //|| <-- OR
        //&& <-- AND
        //!= <-- DIFERENTE
        if(temperatura>=110){ 
            System.out.println("La temperatura es muy alta, favor de apagar el coche y revisar el problema");
            System.out.println("Revisa el nivel del aceite");
        }//if
        else{
            if(temperatura<-10){
                System.out.println("La temperatura es muy baja, favor de calentar el motor para su uso");
            }//if
            else{
                
                System.out.println("La temperatura es optima para continuar con el uso de tu coche");
            }//else
            
        }//else
        lector.nextLine();
        System.out.println("Escribe -s- para salir ");
        salida=lector.nextLine();
        if(salida.equals("s")||salida.equals("S")|| salida.equalsIgnoreCase("si")){ //.equalsIgnoreCase("s")
            System.out.println("Adios camarada");
            System.exit(0);
        }    
    }//main
}//class