/*
 * Sum of elements of array of size N
 */

package Shubhangi;

public class Program_3 {
	
	
	int sum;
	
	int addArray(int x[]) {
		for(int i=0; i<x.length; i++) {
			sum = sum+ x[i];
		}
		
		return sum;
	}

	public static void main(String[] a) {
		int n=3;
		int data[] = new int[n];
		data[0]= 6;
		data[1]= 3;
		data[2] = 8;
		
		Program_3 p3 = new Program_3();
		System.out.println(p3.addArray(data));
	}

}
