public class TA1{
    public static void main (String [] args){
        int [] A1 = {8,3,6,19,75,4,2,-65,7,};
        int [] A2 = new int [A1.length];
        for(int cont=0;cont<A1.length;cont++){
            A2[cont]=A1[cont];
        }
        for(int cont=0;cont<A1.length;cont++){
            System.out.printf("\n Arreglo 1: %d y Arreglo 2: %d ",A1[cont],A2[cont]);
        }
    }
}
