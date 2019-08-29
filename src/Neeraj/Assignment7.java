// You are given two numbers N and M, print the absolute difference between two numbers i.e. |N−M| 

package Neeraj;

class Assignment7 {
	void sum(int x, int y) {
		int diff = x - y;
		if (diff < 0) {
			diff = diff * (-1);
			System.out.println("The difference is:" + diff);
		} else {
			System.out.println("Difference is absolute");
		}

	}

	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.sum(9, 79);

	}
}