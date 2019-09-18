package Shubhangi.patternprint;

import java.util.Scanner;

public class Program_3 {
	
    void printStar(int star) {
		
    	int i, j, k;
    	for(i=star;i>=1;i--)
    	{
    		for(j=1;j<i;j++)
    		{
    			System.out.print("  ");
    		}
    		for(k=5;k>=i;k--)
    		{
    			System.out.print("* ");
    		}
    	
    	System.out.println();
    	}
	}
	
	public static void main(String[] args) {
		
	Program_3 p1 = new Program_3();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How may rows you want to print: ");
	sc.nextInt();
	p1.printStar(5);
	sc.close();
	}
}
