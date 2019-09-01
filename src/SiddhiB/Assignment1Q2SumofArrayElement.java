package SiddhiB;

public class Assignment1Q2SumofArrayElement 
{	int sum =0;
	void sumOfElement(int ary [])
	{
		for (int index = 0;index<ary.length;index++)
		{
			System.out.println (ary[index]);
			sum = sum+ ary [index];
		}		
		
		System.out.println("Sum of four array elements is :" + sum);
	}
	public static void main(String[] args) 
	
	{
		int ary[] = {15,23,31,23};
		Assignment1Q2SumofArrayElement aae = new Assignment1Q2SumofArrayElement();
		aae.sumOfElement(ary);
		
	}

}
