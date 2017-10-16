import java.util.*;
public class ArregloCali{
    public static void main (String [] args){
        Scanner lector = new Scanner (System.in);
        int cuantas;
        double sumatoria=0;
        double [] Calis;
        System.out.println("¿Cuantas calificaciones quieres calcular?");
        cuantas=lector.nextInt();
        Calis=new double [cuantas];
        for(int cont=0;cont<cuantas;cont++){
            System.out.println("Calificación "+(cont+1)+": ");
            Calis [cont]=lector.nextDouble();
        }
        //mayorMenor(Calis);
        Suma(Calis);
        lector.nextLine();
        System.out.println("¿Deseas cambiar alguna calificación");
        String res =lector.nextLine();
        while(res.equalsIgnoreCase("SI")){

            System.out.println("Que calificacion deseas cambiar ");
            int cal=lector.nextInt();
            cal-=1;
            System.out.print("Dame la nueva calificación: ");
            Calis[cal]=lector.nextDouble();
            Suma(Calis);
        }
        
    }
    public static void Suma(double [] arreglo){
        double sumatoria=0;
        for(int cont=0;cont<arreglo.length;cont++){
            System.out.printf("Tus calificaciones son %.2f%n",arreglo[cont]);
            sumatoria+=arreglo [cont];
        }
        System.out.printf("Tu promedio es: "+(sumatoria/arreglo.length));
    }
    /*
    public static void mayorMenor(double [] arr){
        double elMenor=0;
        for(int cont=0;cont<=arr.length;cont++){
            if(arr[cont]<arr[cont+1]){
                elMenor=arr[cont];
            }
            else{
                elMenor=arr[cont+1];
            }
        }
        System.out.println(elMenor);
    }
    */
}