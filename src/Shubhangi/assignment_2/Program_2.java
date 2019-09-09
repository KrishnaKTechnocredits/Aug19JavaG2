/*
 * Find duplicate number in array
 */

package Shubhangi.assignment_2;

import java.util.Scanner;

public class Program_2 {
	
	void duplicate(int a[]) {
		
		
        
        for (int i = 0; i < a.length; i++)  
        { 
            for (int j = i + 1; j < a.length; j++)  
            { 
                if (a[i] == a[j])  
                    System.out.print("Duplicate number is : "+ a[i]); 
            } 
        } 
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of String array"); 
        int length = sc.nextInt();
        
        int[] arr = new int[length];
        
        System.out.println("Please enter array elements");
        
        for (int i = 0; i < length; i++) { 
        	int userInput = sc.nextInt();
        	 arr[i] = userInput;     
        }
        
        Program_2 p1 = new Program_2();
		p1.duplicate(arr);
	
	}
}

