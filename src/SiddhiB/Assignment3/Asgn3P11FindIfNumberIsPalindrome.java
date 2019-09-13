package SiddhiB.Assignment3;

public class Asgn3P11FindIfNumberIsPalindromeObselete 
{
	//static int number = 0;
	
	static void findNumberIsPalindrome(int num)
	{ 	int reversenum = 0;
		while (num>0)
		{
			reversenum = num*10 + num%10;
			num = num / 10;
			
		} System.out.println(reversenum);
		
		if (num == reversenum)
		{
			System.out.println("number is palindrome");
		}
	}
	public static void main(String[] args) 
	
	{	
		int inputNumber = 12321;
		findNumberIsPalindrome(inputNumber);

	}

}
