package BhudeviS;

public class Pattern6Final {

	private static void Pattern6Final(int rows) {

		for (int i = 1; i <= rows; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= rows; i++) 
		{
			for (int j = rows-1; j >= i; j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
	
	}

	public static void main(String[] args) {

		Pattern6Final(5);

	}
}