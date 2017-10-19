import javax.net.ssl.ExtendedSSLSession;
import java.util.*;
public class Recursiva100{
    public static void main (String [] args){
        int n=100;
        conteo(n);
    }
    public static void conteo(int n){
        if(n<=0)
            return;
        else{
            conteo(n-1);
            System.out.printf("%d \n",n);
            return;
            }
    }
}
