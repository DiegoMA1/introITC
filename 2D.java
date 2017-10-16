import java.util.Random;
public class 2D{
    public static void main (String[]args){
        int [][] matriz =new int [3][2];
        matriz[0][0]=7;
        matriz[0][1]=8;
        matriz[1][0]=2;
        matriz[1][1]=4;
        matriz[2][0]=8;
        matriz[2][1]=3;
        for(int x=0;x<matriz.lenght;x++){
            for(int y=0;y<matriz[0].lenght; y++){
                System.out.printf("(%d,%d)=%d\t",x,y,matriz[x][y]);
            }
        }
    }
}