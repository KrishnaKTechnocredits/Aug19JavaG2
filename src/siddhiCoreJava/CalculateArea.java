package siddhiCoreJava;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter fisrt parameter");
		int a = sc.nextInt();
		System.out.println("enter second parameter");
		int b = sc.nextInt();
		System.out.println("enter ");	
		char area = sc.next().charAt(0);
			
		
		switch(area)
		{
		case 'r':
			System.out.println("area of ractable is " + (a*b));
			break;
		case 't':
			System.out.println("area of triangle is "+ (.5*(a*b)));
			break;
		case 'c':
			System.out.println("area of circle is " + (3.14*(a*a)));
		}
		
	}

}
