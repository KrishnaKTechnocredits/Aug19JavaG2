package AmitaR;

public class P10
{
public static void main(String[] args) 
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
		int num=5;
		for(int i=1 ;i<num; i++)
			{
				for(int j=1; j<=num; j++)
				{
					System.out.println(" ");
				}
				for(int k=1; k<=i; k++)
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			
		}
	
}

