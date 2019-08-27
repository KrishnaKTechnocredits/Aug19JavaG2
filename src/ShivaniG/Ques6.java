
package ShivaniG;

class Ques6
{
	public static void main ( String[] args )
	{
		int n = 3;
		int[] numArrayA   = {3,9,8}; 
		int[] numArrayB   = {8, 12, 74};
		int[] sum    = {0,0,0};
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; i < n; i++)
			{
				sum[i] = numArrayA[i] + numArrayB[j];
			}
		}
		System.out.println("sum: " + sum[0]+"," + sum[1] + ","  + sum[2] );
	} 
}