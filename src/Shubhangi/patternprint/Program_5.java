package Shubhangi.patternprint;

import java.util.Scanner;

public class Program_5 {
	
	void printStar(int star) {
		
    	int i, j, k;
    	
    	for(i= 1;i<=star;i++)
    	{   
    		for (k=1; k<i; k++) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
    		
    		for(j=1;j<=star-i+1;j++)
    		{//(j=star;j>=i;j--)
    		System.out.print("* ");
    		}
    	
    	
    	System.out.println();
    	}
	}
	
	public static void main(String[] args) {
		
	Program_5 p1 = new Program_5();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How may rows you want to print: ");
	sc.nextInt();
	p1.printStar(5);
	sc.close();
	}
	
}
