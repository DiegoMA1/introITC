import java.util.Scanner;
public class Arreglos1{
    public static void main(String [] args){
        Scanner lector = new Scanner (System.in);
        double numeros [] //Correcto pero no usado
        int [] array={3,5,8};
        int [] arreglo2= new int[5];
        for (int i=0;i<3;i++){
            System.out.println(array[i]);
        }
        System.out.println("Tamanno: "+array.length);

        arreglo2[0]=95;
        arreglo2[1]=80;
        arreglo2[2]=70;
        arreglo2[3]=100;
        arreglo2[4]=65;
        double suma=0,prom;
        for( int cont=0;cont<=arreglo2.length;cont++){
            suma+=(double)arreglo2[cont];
        }
        prom=(suma/(double)arreglo2.length);
        System.out.println(prom);
        
    }
}