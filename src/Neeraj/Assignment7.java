<<<<<<< HEAD
class Assignment7
{
	//int x=79;
	//int y=99;

	int sum(int x,int y)
	{
		int diff= x-y;
		//System.out.println(diff);
		if(diff<0)
		{
			diff = diff*(-1);
			System.out.println(diff);
		}
		else
		{
			System.out.println("Difference is absolute");
		}
		return diff;
	}

	public static void main(String[] args) {
		Assignment7 assignment7= new Assignment7();
		assignment7.sum(9,79);
		//System.out.println("Print the Absolute value:" + new Assignment7().sum(79,79));
=======
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

>>>>>>> 979f5e5d23c3f87d03b2a83394c3b7f16db0cd50
	}
}