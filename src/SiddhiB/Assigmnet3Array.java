package SiddhiB;
class Assigmnet3Array
{	int sum = 0; 
	 void sumOfHundredInteger(int aryvaluereceived[])
	{
		for (int i = 0;i<aryvaluereceived.length;i++)
		{	System.out.println(i +" th "+"elements is:"+ aryvaluereceived[i]);
			sum = aryvaluereceived[i]+sum;
		}
			
		System.out.println("sum of array elements is :" + sum);
		 		
	}
	
	
	public static void main (String args[])
	{	
		int ary [] = {1,89,67,100};	
		Assigmnet3Array a3a = new Assigmnet3Array();
		a3a.sumOfHundredInteger (ary);
		
	}


}