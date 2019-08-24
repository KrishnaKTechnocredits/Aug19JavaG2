package AdityaT;

public class PrimeCheck {

	public static void isPrime(int start, int end)
	{
	int sum = 0, count =0;
	for (int number = start;number <= end; number++)
		{
			int cnt = 0;
				for(int i=2;i<=number/2;i++)
		{
				if(number%i == 0)
			{	
				cnt=1;
				System.out.println(number +  "not prime");
				break;
			}
		}
		if(cnt==0)
		{	count++;
			System.out.println(number + " is prime");
			sum=sum+number;
		}
		}
	     System.out.println("SUM OF ALL PRIME NUMBER IS" + sum);
	     System.out.println("From" +start+ "to"+end+"total prime" +count);
	     System.out.println("Average of prime number is" + (sum/2));
	     System.out.println("Average of non prime number is" + (count/2));
	}
	
	public static void main(String[] args) 
	{	
			isPrime(200,300);
	
	}	
	}
	 
