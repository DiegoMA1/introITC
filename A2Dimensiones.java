import java.util.Random;
public class A2Dimensiones{
    public static void main (String[]args){
        int [][] matriz =new int [3][2];
        matriz[0][0]=7;
        matriz[0][1]=8;
        matriz[1][0]=2;
        matriz[1][1]=4;
        matriz[2][0]=8;
        matriz[2][1]=3;
        for(int x=0;x<matriz.length;x++){
            for(int y=0;y<matriz[0].length; y++){
                System.out.printf("%d\t",matriz[x][y]);
            }
            System.out.println();
        }
    }
}