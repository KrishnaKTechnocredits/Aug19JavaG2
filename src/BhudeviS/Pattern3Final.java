package BhudeviS;

public class Pattern3Final {

	
	public static void main(String[] args) {

		
		//System.out.println("*");
		
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i-1; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
			

	}
}
