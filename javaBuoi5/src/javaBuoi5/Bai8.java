package javaBuoi5;
import java.util.Scanner;
import java.lang.Math;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		long  g = 1;
		
		System.out.println("Nhap so bat ki`: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			g*= i;
		}
		
		System.out.println("Giai thua` cua " + n +" la`: "+ g);
	}

}
