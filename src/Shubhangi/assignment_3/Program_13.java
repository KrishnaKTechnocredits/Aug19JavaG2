/*
 * WAP to find number is Armstrong or not.
 */

package Shubhangi.assignment_3;

import java.util.Scanner;

public class Program_13 {
	
	int num,sum;
	
	void findArmstrong(int n) {
		
		int temp = n;
		while(n>0) {
			int digit = n%10;
			sum = sum+(digit*digit *digit);
			n=n/10;
			
		}
		
		if(temp==sum) {
			System.out.println("Number is armstrong");
		}else {
			System.out.println("Number is not armstrong");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		Program_13 p7 = new Program_13();
		p7.findArmstrong(num);
		sc.close();
	}

}
