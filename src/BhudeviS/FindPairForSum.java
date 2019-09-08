package BhudeviS;

public class FindPairForSum {

	void FindPairForSum()
	{
		int arr[]= {2,4,3,5,7,8,9};
		int sum=7;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("{"+arr[i]+","+arr[j]+"}");
				}
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		FindPairForSum fp= new FindPairForSum();
		fp.FindPairForSum();
	}
}
