public class Assignment2P3
{
	
	public static void main(String[] args)
	{
		int[] num={2,5,9,7,4,6};
		int numero = 11;
		new Assignment2P3().findTheGivenMissingNumber(num , numero);
	}
	
	void findTheGivenMissingNumber(int arr[], int x)
	{
	    int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
			    count++;
			    break;
			}
		}
		if(count==0)
		{
		    System.out.println(x+" Number is not in array");
		}else
		{
		    System.out.println(x+" Number is in array");
		}
	}
}
	