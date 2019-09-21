package Shubhangi.patternprint;

import java.util.Scanner;

public class Program_8 {
		
	void printStar(int row) {
		
		for(int i = 1; i<=row; i++) {
			
			for (int k= row-1; k>=i; k--) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 1; i<=row; i++) {
			for (int k= 1; k<=i; k++) {
				System.out.print(" ");
			}
			
			for (int j=row-1; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		
		}
	}
	
	public static void main(String[] args) {
		
	Program_8 p1 = new Program_8();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How may rows you want to print: ");
	sc.nextInt();
	p1.printStar(5);
	sc.close();
	}
}
