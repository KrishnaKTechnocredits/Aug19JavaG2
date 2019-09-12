package SiddhiB;
public class ArrayFindTotalSumandCountOfPositiveNumber 
{	static int pcount = 0;
	static int ncount =0;
	static int psum = 0;
	static int nsum = 0;
	static void display(int receivedary[])
	{	
		for (int i = 0;i<receivedary.length;i++)
		{
			if (receivedary[i]>0)
			{	
				pcount ++;
				psum = psum + receivedary[i];
			}
			else if (receivedary[i]<0)
				{
					ncount ++;
					nsum = nsum + receivedary[i];
				}
		} 
		System.out.println("count of positive number is :" + pcount);
		System.out.println("count of negative number is :" + ncount);
		System.out.println( "sum of positive number is :" + psum);
		System.out.println( "sum of negative number is :" + nsum);
		
	}
	public static void main(String[] args) 
	
	{
		int ary [] = {10,-9,-3,-4,14,19,-23,0,0};
		display(ary);
	}

}
