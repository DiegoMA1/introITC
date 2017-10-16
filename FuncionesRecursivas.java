public class FuncionesRecursivas{
    public static void main (String [] args){
        //CALCULO DE SUMATORIA HASTA N
        // 1 + 2 + 3 + ...
        int n = 15;
        
        System.out.format("%d",sumatoriaRecursiva(n));
    }
    public static int sumatoriaRecursiva(int n){
        if(n==1)
            return 1;
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
}