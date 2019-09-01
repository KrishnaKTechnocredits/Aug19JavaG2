package BhudeviS;

public class LargestSmallestNumber {

	void LargestSmallest()
	{
		int arr[]={2,6,3,9,11};
		int smallest= arr[0];
		int largest= arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
				smallest=arr[i];
			else if(arr[i]>largest)
				largest=arr[i];
			
		}
		System.out.println(smallest);
		System.out.println(largest);
		
	}
	
	public static void main(String[] args) {
		LargestSmallestNumber lm= new LargestSmallestNumber();
		lm.LargestSmallest();
	}
}
