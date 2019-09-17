package BhudeviS;

public class Pattern5Final {

	public static void main(String[] args) {
		Pattern5Final(5);

	}

	private static void Pattern5Final(int n) {
		for (int i = n; i >=1; i--) {
			
			for (int k = 1; k <= n - i+1; k++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
