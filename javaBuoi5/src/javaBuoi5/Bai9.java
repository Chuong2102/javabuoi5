package javaBuoi5;

import java.util.Scanner;
import java.lang.Math;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		int dv = 0;
		
		System.out.println("Nhap so bat ki`: ");
		n = input.nextInt();
		
		System.out.print("Dao nguoc cua " + n +" la`: ");
		
		while(n != 0) {
			dv = n % 10;
			n = n/ 10;
			System.out.print(dv);
		}
	}

}
