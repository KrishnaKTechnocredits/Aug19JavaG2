package Neeraj;


class Assignment6
{
	 static int[] sum= new int[3] ;
	void sumArray(int[]numArrayA,int[]numArrayB)
	{
		

		for (int i=0;i<numArrayA.length ;i++ )
		{
			//if(numArrayA[i]>=1 && numArrayA=<100)			{

			//System.out.println(numArrayA[i]);
			//System.out.println(numArrayB[i]);

			 sum[i] = numArrayA[i] + numArrayB[i];
			System.out.print(" "+sum[i]);
			//}else
			//{
			//System.out.println("Array out of Range");
			
			//}
		}
	}
	public static void main(String[] args) {
		int[] numArrayA={23,46,69};
		int[] numArrayB={33,66,99};
		Assignment6 assignment6=new Assignment6();
		assignment6.sumArray(numArrayA,numArrayB);

		//System.out.println(sum);
	}
}