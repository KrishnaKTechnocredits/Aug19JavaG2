/*
 * Print elements in array between given L and R
 */

package Shubhangi;

public class Program_5 {

	void allInteger(int start, int end) {
		
		for(int i = start; i<=end; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		Program_5 p = new Program_5();
		p.allInteger(5,10);
	}
}
