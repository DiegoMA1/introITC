public class TA3{
    public static void main (String [] args){
        int [] A1 ={-7,17,4,-11,5,-12,14,16,11,1,-1,14,-7};
        for(int cont=0;cont<=A1.length;cont++){
            for (int cont2=0;cont2<A1.length;cont2++){
                if(!(cont==cont2)){
                    if(A1[cont]==A1[cont2]){
                        System.out.printf("El número %d se repite en las posiciones %d y %d \n",A1[cont],cont,cont2);
                    }
                }            
            }
        }
    }
}