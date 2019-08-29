package BhudeviS;

public class PrintReverseArray {

	
	void PrintReverseArray()
	{
		int arr1[]={1,3,6,9,7};
	//	System.out.println(arr1.length);
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.println(arr1[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		PrintReverseArray pr= new PrintReverseArray();
		pr.PrintReverseArray();
	}
}
