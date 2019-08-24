package ShivaniG;

public class PrimeCheck {
	
	static void isPrime(int number)
	{
		int cnt = 0;
		for(int i =2; i <= number/2; i++)
		{
			if (number%i == 0 )
			{
				cnt =1;
				System.out.println(number + " Number is not Prime, as it is divisible by " + i);
				break; //condition never breaks from it; it can terminate loop
			}
		}
		if (cnt==0)
		{
			System.out.println(number + " Number is  Prime");
		}
		
	}

	public static void main(String[] args) 
	{
		isPrime(17);
	}
}
