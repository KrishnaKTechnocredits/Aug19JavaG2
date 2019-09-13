package BhudeviS;

public class FindUniqueNumberStoreArray {
	static void FindUniqueNumberStoreArray()
	{
		int arr1[]={1,2,3,4,2,5};
		int arr2[]={5,6,7,8,9,7};
		int[] outArray= new int[arr1.length+arr2.length];
		int index=0;
	
		for(int i=0;i<arr1.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<outArray.length;j++)
			{
				if(arr1[i]==outArray[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				outArray[index]=arr1[i];
				index++;
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<outArray.length;j++)
			{
				if(arr2[i]==outArray[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				outArray[index]=arr2[i];
				index++;
			}
		}
		for(int k=0;k<outArray.length;k++)
		{
			if(outArray[k]!=0)
		System.out.println(outArray[k]);
		}
	}
	
	
	public static void main(String[] args) {
		FindUniqueNumberStoreArray();
	}
}
