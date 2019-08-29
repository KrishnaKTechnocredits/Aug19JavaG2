package BhudeviS;

public class FindAllDiffer {

	void FindAllDiffer()
	{
		int arr1[]={1,2,3,4};
		int arr2[]={1,5,3,9};
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==arr2[i])
			{
				
			}
			else System.out.println("Different number is at index:"+i+" and Number is:"+arr2[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		FindAllDiffer ff= new FindAllDiffer();
		ff.FindAllDiffer();
	}
}
