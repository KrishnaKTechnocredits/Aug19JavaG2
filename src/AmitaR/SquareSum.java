package AmitaR;

class SquareSum
{
 void sum()
	{
		//int a[]={10,54,85,13,54,91};
		
		int a[]={4,7,2,8,5};
		int sum=0;
 
		for (int i=0;i<a.length;i++)
		{
		sum=sum+a[i]*a[i];
		
		}
		System.out.println("Sum of arrays are : " + sum);
	}
	public static void main(String args[])
	{

		
		//System.out.println("Sum of arrays are : " + sum);
		new SquareSum().sum();
	}
}

