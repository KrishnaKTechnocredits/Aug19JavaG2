package Shubhangi.patternprint;

import java.util.Scanner;

public class Program_2 {
	
	void printStar(int star) {
		
		for(int i = 1; i<=star; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
	Program_2 p1 = new Program_2();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How may rows you want to print: ");
	sc.nextInt();
	p1.printStar(5);
	sc.close();
	}
	
}
