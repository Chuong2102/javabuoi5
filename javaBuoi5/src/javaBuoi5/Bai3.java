package javaBuoi5;
import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int s = 0;
		int n = 0;
		System.out.println("Nhap so phan tu: ");
		n = input.nextInt();
		
		for(int i = 0; i<n; i++) {
			s+= i;
		}
		System.out.println("Tong tu 1 den "+ n + " la`: "+ s);
	}

}
