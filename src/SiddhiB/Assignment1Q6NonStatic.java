package SiddhiB;

public class Assignment1Q6NonStatic 

{	
	 void sumofArray(int ary1[],int ary2[])
	{	int sum []  = new int [2];
		for ( int i = 0;i<ary1.length;i++)
		{
		sum [i] = ary1[i]+ary2[i];
		System.out.print(" " +sum[i]);
		}
	}

	public static void main(String[] args) 
	{
		
		int ary1[] = {1,2};
		int ary2[] = {4,5};
		Assignment1Q6NonStatic ans = new Assignment1Q6NonStatic();
		ans.sumofArray(ary1,ary2);
	}

}
