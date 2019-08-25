package Siddhib;
class Assignment2Array
{
	static void m1(int sum[])
	{
		int total = 0;
		int ary [] = {12,23,31,15};
		//int ary [] = new int [10];
		//sum (int [] x) 
		for (int i =0; i<ary.length;i++)
			{
				System.out.println(ary [i]);
				total = total + ary[i];
			}
			
			System.out.println("total is :" + total);

	}
	public static void main (String [] variable)
		{
			m1(int ary);
		}	
}		