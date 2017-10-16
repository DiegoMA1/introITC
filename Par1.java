public class Par1{
    public static void main (String[] args){
        for(int cont=1;cont<=40;cont++){
            System.out.print(cont);
            if(cont%2==0 && cont%3==0){
                System.out.print(" es par y divisible entre 3 ");
            }
            System.out.println();
        }
    }
}