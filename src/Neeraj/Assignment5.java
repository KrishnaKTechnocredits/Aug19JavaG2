//  WAP to list all the integers between two integers L and R (including L and R). L and R can be any integer between 1 and 100. 1≤L,R≤100. 
package Neeraj;

class Assignment5 {
	void display(int x, int y) {

		for (int i = x; i <= y; i++) {
			if (i >= 1 && i <= 100) {
				System.out.print(" " + i);
			} else {
				System.out.println("Out of Range");
			}

		}

	}

	public static void main(String[] args) {
		Assignment5 assignment5 = new Assignment5();
		assignment5.display(5, 10);

	}
}