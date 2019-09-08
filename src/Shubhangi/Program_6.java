/*
 * Program to add corresponding elements of two array
 */

package Shubhangi;

public class Program_6 {

	int sum;
	
	void m1(int x[], int y[]){
		
		for(int i=0; i< x.length; i++) {
			for(int j=0; j<y.length; j++) {
				if(i==j) {
					sum = x[i]+y[j];
					System.out.println(sum);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int numArrayA[] = {3, 9, 8};
		int numArrayB[] = {8, 12, 74};
		
		Program_6 p = new Program_6();
	    p.m1(numArrayA, numArrayB );
	}
}
