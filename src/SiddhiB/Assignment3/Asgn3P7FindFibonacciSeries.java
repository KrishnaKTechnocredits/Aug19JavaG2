package SiddhiB.Assignment3;

public class Asgn3P7FindFibonacciSeries 
{	
	static void findFibonacciSeries (int receivingNumber)
	{   int multiplicaton = 1;
		for (int i =5;i>0;i--)
		{
			multiplicaton = multiplicaton * i ;
			
		} 
		System.out.println("FibonacciSeries output is :" + multiplicaton);
	}
	public static void main(String[] args) 
	
	{	int number = 5;
		findFibonacciSeries(number); 
	}

}
