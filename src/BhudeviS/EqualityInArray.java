package BhudeviS;

import java.util.Arrays;

public class EqualityInArray {

	void EqualityInArray()
	{
		int arr1[]={1,2,3};
		int arr2[]= {1,2,3};
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Arrays are equal");
			
		}
		else
			System.out.println("Arrays are not equal");
			
		
	}
	
	
	public static void main(String[] args) {
		EqualityInArray eq= new EqualityInArray();
		eq.EqualityInArray();
	}
}
