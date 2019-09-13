//print 
/*1
12
123
1234
*/


package SiddhiB;

import java.util.Scanner;

public class Practicepattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the value to be printed");
		int num = sc.nextInt();
		sc.close();
		for (int i = 1;i<=4;i++)
		{
			for (int j = 1; j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
		
	}

}
