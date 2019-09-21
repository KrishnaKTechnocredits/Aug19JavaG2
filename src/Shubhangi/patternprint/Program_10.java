package Shubhangi.patternprint;

import java.util.Scanner;

public class Program_10 {
void printStar(int rows) {
		
	for (int i=1; i<= rows ; i++) { 
		for (int j = rows; j > i ; j--) {
        System.out.print(" ");
    }
    System.out.print("*");
    for (int k = 1; k < 2*(i -1) ;k++) { 
    	System.out.print(" ");
    	} 
    if( i==1) {
    	System.out.println(""); 
    	} else{ 
    	System.out.println("*"); 
    	} 
    } 
	
	for (int i=rows-1; i>= 1 ; i--)
    {
    for (int j = rows; j > i ; j--) {
        System.out.print(" ");
    }
    System.out.print("*");
    for (int k = 1; k < 2*(i -1) ;k++) {
        System.out.print(" ");
    }
    if( i==1)
        System.out.println("");
    else
        System.out.println("*");
    }
	}
	
	public static void main(String[] args) {
	Program_10 p1 = new Program_10();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How may rows you want to print: ");
	sc.nextInt();
	p1.printStar(5);
	sc.close();
	}
}
