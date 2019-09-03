package SiddhiB;
class Assignment2Array
{
	static void m1(int sum[])
	{
		int total = 0;
		
		for (int i =0; i<sum.length;i++)
			{
				System.out.println(sum [i]);
				total = total + sum[i];
			}
			
			System.out.println("total is :" + total);

	}
	public static void main (String [] variable)
		{	
		  int ary [] = {12,23,31,15};
			m1(ary);
		}	
}		