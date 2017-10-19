import java.util.*;
public class NxN{
	public static void main (String [] args){
		int [][] A1;
		int n;
		Scanner lector = new Scanner (System.in);
		System.out.println("Dame el valor de N");
		n=lector.nextInt();
		A1=new int[n][n];
		Random rdn = new Random();
		for(int x=0;x<A1.length;x++){
			for(int y=0;y<A1.length;y++){
				A1[x][y]=rdn.nextInt(7)+1;
				System.out.printf("%d\t",A1[x][y]);
			}
			System.out.println();
		}
	}
	public static void simetria(){
		
	}
}