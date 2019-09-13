package SiddhiB.Assignment3;

public class Asgn3Program1FindPositiveNegativeNumberAndSum 

{	
	static int Psum = 0;
	static int Nsum = 0;
	static void findPositiveNegativeNumber(int[] ary)
	{
		for (int i = 0;i<ary.length;i++)
		{
			if (ary [i]<0)
			{
				System.out.print(" Negative numbers are :");
				System.out.println(ary[i]);
				Nsum = Nsum + ary[i];
				
				
			}
			else 
			{
				System.out.print(" Positive numbers are : ");
				System.out.println(ary[i]);
				Psum = Psum + ary[i];
			}
			
		} 
		System.out.println("Sum of all positive numbers is :" + Psum);
		System.out.println("Sum of all negative numners is :" + (Nsum*(-1)));
	}
	public static void main(String[] args) 
	{
		int array [] = {5, 6, -9, 14, -25, 6, 7, -14};
		findPositiveNegativeNumber(array);

	}

}
