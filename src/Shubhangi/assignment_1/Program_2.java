/*
 * Sum of all elements of an array of size 4 
 */

package Shubhangi.assignment_1;

public class Program_2 {

	int total;
	
	int addArray(int x[]) {
		for(int i=0; i<x.length; i++) {
			total = total+ x[i];
		}
		
		return total;
	}

	public static void main(String[] a) {
		
		int [] data = new int [] {1, 2, 3, 4};  
		Program_2 s = new Program_2();
		System.out.println(s.addArray(data));
	}
	
}
