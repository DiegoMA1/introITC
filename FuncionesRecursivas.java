public class FuncionesRecursivas{
    public static void main (String [] args){
        //CALCULO DE SUMATORIA HASTA N
        // 1 + 2 + 3 + ...
        int n = 5;
        
        System.out.format("%d\n",sumatoriaRecursiva(n));
        System.out.format("%d\n",factorial(n));
        while(n!=0){
            System.out.format("%d\n",fib(n));
            n--;
        }
        
    }
    public static int sumatoriaRecursiva(int n){
        if(n==1) 
            return 1;
        else if (n<0)
            return 0;
        else
        
            return n+sumatoriaRecursiva(n-1);
    }
    public static int sumatoria (int n){
        int suma = 0;
        for (int cont=1;cont<=n;cont++){
            suma+=cont;
        }
        return suma;
    }
    public static long factorial(long n){
        if(n<=1)
            return 1;
        else    
            return n*factorial(n-1);
    }
    public static int fib (int n){
        if(n<=1)
        return n;
    else    
        return fib(n-1) + fib(n-2);
    }
}