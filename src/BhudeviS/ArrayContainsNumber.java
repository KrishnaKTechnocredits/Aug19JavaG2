package BhudeviS;

public class ArrayContainsNumber {

	static void ArrayContainsNumber(int []arr, int num)
	{
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]== num)
				count++;
				}
		if(count==1)
			System.out.println(num+":"+"This number is present in array");
		else
			System.out.println(num+":"+"This number is not present in array");
		
	}
	
	public static void main(String[] args) {
		ArrayContainsNumber arra= new ArrayContainsNumber();
		int arr[]={1,2,3};
		arra.ArrayContainsNumber(arr, 2);
	}
}
