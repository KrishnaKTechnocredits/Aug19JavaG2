/*
 * Sum of two integers
 */

package Shubhangi.assignment_1;

public class Program_1 {
	
	int c;
	static int total;
	
	int add(int x, int y) {
		c = x+y;
		return c;
	}

	public static void main(String[] a) {
		Program_1 s = new Program_1();
		total = s.add(5,10);
		System.out.println(total);
	}

}


