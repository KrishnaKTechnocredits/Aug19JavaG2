package AmitaR;

public class PrimeCheck1to100 {
	
	//static void isPrime(int number)
	//static void isPrime()
	
	static void isPrime(int start,int end)
	{
		int sum=0,count=0;
		//for(int number=2;number<=100;number++)
		for(int number=start;number<=end;number++)	
		{
		 int cnt=0;
		 for(int i=2;i<=number/2;i++)
		 {
			if(number%i == 0)
			{
				cnt=1;
				//System.out.println(number + " is not prime");
				break; //is used to terminate the for loop not the if statement
			}
			
		
		 }
		
		      if(cnt==0)
		       {
		    	  count++;//count = count+1;
			      System.out.println(number + " is prime");
			      sum=sum+number;
		       }
	  }
		System.out.println("the sum of all the prime numbers is :" + sum);
		System.out.println("the total no of prime numbers are : " + count);
		System.out.println("the average of all prime nos are : " + (sum/count));
		
	}

	public static void main(String[] args) {
		
		//for(int i=2;i<=100;i++)
		//{
			//isPrime();
		isPrime(1,100);
		//}

	}

}
