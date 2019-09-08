package AmitaR;
import java.util.Scanner;
public class P1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of rows");
	int rows=sc.nextInt();
			
	for(int i=1; i<=rows; i++)
	{
		for(int j=1; j<=i; j++)		
		{
			System.out.print("* ");
		}
		System.out.println();
	}

	}
}
