<<<<<<< HEAD
class Assignment4
{
	int sum=0;
	//int[] num={9,8,7,6};
	int square(int[]num)
	{
		//int[] num={9,8,7,6};
		for (int i=0; i<num.length;i++ ) 
		{
			if(num[i]>=1 && num[i]<=100)
			{
				sum = sum + num[i]*num[i];
			}else
			{
				System.out.println("Out of Range");
			}
			
=======
// WAP to print the sum of squares of the elements of an array of size N. N can be any integer between 1 and 100. 1≤N≤100 
package Neeraj;

class Assignment4 {
	int sum = 0;

	int square(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 1 && num[i] <= 100) {
				sum = sum + num[i] * num[i];
			} else {
				System.out.println("Out of Range");
			}

>>>>>>> 979f5e5d23c3f87d03b2a83394c3b7f16db0cd50
		}

		return sum;
	}

	public static void main(String[] args) {
<<<<<<< HEAD
		int[] num={9,8,7,106};
		//Assignment4 assignment4= new Assignment4();
		//assignment4.square(num);
=======
		int[] num = { 9, 8, 7, 10 };
>>>>>>> 979f5e5d23c3f87d03b2a83394c3b7f16db0cd50
		System.out.println("Sum of Square of an Array Element:" + (new Assignment4().square(num)));
	}
}