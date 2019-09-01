package SiddhiB;

public class Assignment1Q6SumOftwoArray 
{	
	static int sum [] = new int [2];
	static void sumArray(int ary1[],int ary2[])
	{	
		for (int i = 0;i<ary1.length;i++)
		{
				sum [i]  = ary1[i]+ary2[i];
				System.out.print(" " +sum [i] );
		}
	} 	
			
	public static void main(String[] args) 
	
	{
		int ary1[] = {1,2};
		int ary2[] = {4,5};
		sumArray(ary1,ary2);                    
		                    
	}

}
