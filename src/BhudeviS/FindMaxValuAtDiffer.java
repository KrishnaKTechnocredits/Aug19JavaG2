package BhudeviS;

public class FindMaxValuAtDiffer {

	void FindMaxValuAtDiffer()
	{
		int arr1[]={1,2,3,4};
		int arr2[]={1,5,3,4};
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				
			
			System.out.println("Different number is at index:"+i+" and Number is:"+arr2[i]);
			if(arr1[i]<arr2[i])
			{
				System.out.println("Maximum value:"+ arr2[i]);
			}
			
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		FindMaxValuAtDiffer ff= new FindMaxValuAtDiffer();
		ff.FindMaxValuAtDiffer();
	}
}
