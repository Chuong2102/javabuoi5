package javaBuoi5;
import java.util.Scanner;
import java.lang.Math;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b;
		boolean isNguyenTo = true;
		
		System.out.println("Nhap phan tu dau`: ");
		a = input.nextInt();
		
		System.out.println("Nhap phan tu cuoi': ");
		b = input.nextInt();
		
		if(a<=1)
			a = 2;
		
		for(int i = a; i <= b; i++) {
			//kiem tra ng to
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					isNguyenTo = false;
				}
			}
			//
			if(isNguyenTo)
				System.out.println(i);
		}
	}

}
