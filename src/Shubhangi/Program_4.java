/*
 * Sum of squares of array elements of size N
 */

package Shubhangi;

public class Program_4 {
	
    int sum;
	
	int addArray(int x[]) {
		for(int i=0; i<x.length; i++) {
			x[i] = x[i]*x[i];
		//	x[i] = (int) Math.pow(x[i], 2);
			sum = sum+x[i];
		}
		
		return sum;
	}

	public static void main(String[] a) {
		
		int[] data = {4,7,2,8,5};  
		Program_4 s = new Program_4();
		System.out.println(s.addArray(data));

	}

}