package Shubhangi.patternprint;

import java.util.Scanner;

public class Program_4 {
	
void printStar(int star) {
		
    	int i, j, k;
    	for(i= 1;i<=star;i++)
    	{
    	for(k=star;k>=i;k--)
    	{
    	System.out.print("* ");
    	}
    	
    	System.out.println();
    	}
	}
	
	public static void main(String[] args) {
		
	Program_4 p1 = new Program_4();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How may rows you want to print: ");
	sc.nextInt();
	p1.printStar(5);
	sc.close();
	}
}
