package BhudeviS;

public class PrintCommonNumber {

	
	void PrintCommonNumber()
	{
		int arr1[]={1,3,6,9,7};
		int arr2[]={2,5,6,9,8};
		for(int i=0;i<arr1.length;i++)
		{
			
			if(arr2[i]==arr1[i])
				System.out.println(arr1[i]);
		}		}
		
	
	public static void main(String[] args) {
		PrintCommonNumber pc= new PrintCommonNumber();
		pc.PrintCommonNumber();
	}
}
