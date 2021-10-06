package javaBuoi5;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int s;
		
		a = 1;
		b = 1;
		System.out.print(a+ " "+ b+ " ");
		for(int i = 0; i < 10; i++) {
			s = a + b;
			a = b;
			b = s;
			System.out.print(s+ " ");
		}
	}

}
