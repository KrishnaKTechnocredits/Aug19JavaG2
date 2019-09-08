package BhudeviS;

public class FindDuplicateNumber {
	
	
	void FindDuplicateNumber()
	{
		int arr[]= {1,1,2};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					count++;
			}
			if(count==1)
				System.out.println(arr[i]);
			count=0;
		}
		
	}
	public static void main(String[] args) {
		FindDuplicateNumber find= new FindDuplicateNumber();
		find.FindDuplicateNumber();
	}

}
