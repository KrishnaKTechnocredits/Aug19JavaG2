package AmitaR;

public class Assignment2Q7 {
	
	static void arraySum(int array[],int number)
	{
	
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]+array[j]==number)
				{
					System.out.println("the numbers are  "+ array[i] +"   " + array [j] );
				
				}
			}
		}
	}	
		public static void main(String[] args) {
			int a[]={2, 4, 3, 5, 7, 6,1, 9};
			int sum=7;
			arraySum(a,sum);
	}
}

