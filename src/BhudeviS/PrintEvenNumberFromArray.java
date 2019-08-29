package BhudeviS;

public class PrintEvenNumberFromArray {

	void PrintEvenNumberFromArray()
	{
		int arr[]={15,24,52,49,62,10};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		PrintEvenNumberFromArray peven=new PrintEvenNumberFromArray();
		peven.PrintEvenNumberFromArray();
	}
}
