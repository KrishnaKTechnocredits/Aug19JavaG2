package SiddhiB;
import java.util.Scanner;

	public class PatternProgram5 {
		void display(int row){
			for (int i= 1; i<= row ; i++)
		    {
		        for (int j=1; j<=i; j++)
		        {
		            System.out.print(" ");
		        }
		        for (int k=0; k<=row-i; k++)
		        {
		            System.out.print("* " );
		        }
		        System.out.println();
		    }
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the row count : ");
			int row = sc.nextInt();
			sc.close();
			new PatternProgram5().display(row);
			}
		}
