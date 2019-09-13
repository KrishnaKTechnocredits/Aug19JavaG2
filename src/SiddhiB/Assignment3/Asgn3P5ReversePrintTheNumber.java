package SiddhiB.Assignment3;

public class Asgn3P5ReversePrintTheNumber 
{	
	static void findReverseNumber (int  num)
	{
		int reverse_num = 0;
		while (num>0)
		{
			reverse_num = reverse_num*10 + num%10;
			num = num/10;
		}
		System.out.println("reverse number of data type integer is :" + reverse_num);
	}
	public static void main(String[] args) 
	{
		int number = 456789;
		findReverseNumber(number);
	}
}
