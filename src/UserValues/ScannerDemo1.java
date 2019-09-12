package UserValues;

import java.util.Scanner;

public class ScannerDemo1 
{

	public static void main(String[] args) 
	
	{
		System.out.println("enter yur name");
		Scanner sc = new Scanner (System.in);
		String name = sc.nextLine();
		

		
		for (int i = 0;i<Integer.parseInt(name.split(" ")[2]); i++)
		{
			System.out.println(name.split(" ")[1]+ "" + name.split(" ")[0]);
		}
	}

}
