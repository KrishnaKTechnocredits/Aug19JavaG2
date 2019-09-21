package Shubhangi.patternprint;

import java.util.Scanner;

public class Program_6 {

void printStar(int rows) {
		
	for (int i= 0; i<= rows-1 ; i++)
    {
        for (int j=0; j<=i; j++) 
        { 
        System.out.print("*"+ " "); 
        } 
        System.out.println(""); 
    } 
	
        for (int i=rows-1; i>=0; i--)
    {
        for(int j=0; j <= i-1;j++)
        {
            System.out.print("*"+ " ");
        }
        System.out.println("");
    }
        
        
	}
	
	public static void main(String[] args) {
		
	Program_6 p1 = new Program_6();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How may rows you want to print: ");
	sc.nextInt();
	p1.printStar(5);
	sc.close();
	}
	
}
