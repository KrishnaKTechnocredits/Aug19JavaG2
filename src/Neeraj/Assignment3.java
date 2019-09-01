<<<<<<< HEAD
class Assignment3
{
	//int[] n= {33,66,99};
	//int[] sum= new int [3];
	int sum =0;
	 int display(int [] n)
	
	{
		for(int i=0; i<n.length; i++)
		{
			if(n[i]>=1 && n[i]<=100)
			{
				sum=sum + n[i];
				//System.out.println(sum);
							 
			}else 
			{
				System.out.println("Out of range");
				break;
				
			}
			

		}
		return sum;
		//System.out.println(sum);
=======
//WAP to print the sum of all the elements of an array of size N where N can be any integer between 1 and 100. 1≤N≤100 

package Neeraj;

class Assignment3 {
	int sum = 0;

	int display(int[] n)

	{
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 1 && n[i] <= 100) {
				sum = sum + n[i];

			} else {
				System.out.println("Out of range");
				break;

			}

		}
		return sum;
>>>>>>> 979f5e5d23c3f87d03b2a83394c3b7f16db0cd50

	}

	public static void main(String[] args) {
<<<<<<< HEAD
		int[] n= {30,60,10};
		
		//Assignment3 assignment3 = new Assignment3();
		//assignment3.display(n);
		//System.out.println("The Sum of Array Element:" + assignment3.sum);
=======
		int[] n = { 30, 60, 10 };

>>>>>>> 979f5e5d23c3f87d03b2a83394c3b7f16db0cd50
		System.out.println("The Sum of Array Element:" + (new Assignment3().display(n)));
	}
}