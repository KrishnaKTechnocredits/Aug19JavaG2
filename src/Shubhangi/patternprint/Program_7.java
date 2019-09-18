package Shubhangi.patternprint;

import java.util.Scanner;

public class Program_7 {
void printStar(int rows) {
		
    	
    	for (int i= 1; i<= rows ; i++)
        {
            for (int j=i; j <rows ;j++)            
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++)
            {
            System.out.print("*");
            }
            System.out.println("");
        } 
    	
    	
            for (int i=rows; i>=1; i--)
        {
            for(int j=i; j<=rows;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<i ;k++) 
            {
                System.out.print("*");
            }
            System.out.println("");
 
        }
    
	}
	
	public static void main(String[] args) {
		
	Program_7 p1 = new Program_7();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How may rows you want to print: ");
	sc.nextInt();
	p1.printStar(5);
	sc.close();
	}
}
