package Shubhangi.patternprint;

import java.util.Scanner;

public class Program_9 {
	void printStar(int rows) {
		
		for (int i=1; i<= rows ; i++)
        {
            for (int j = i; j < rows ; j++) {
                System.out.print(" ");
            }   
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == rows || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
	}
	
	public static void main(String[] args) {
	Program_9 p1 = new Program_9();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How may rows you want to print: ");
	sc.nextInt();
	p1.printStar(5);
	sc.close();
	}
}
