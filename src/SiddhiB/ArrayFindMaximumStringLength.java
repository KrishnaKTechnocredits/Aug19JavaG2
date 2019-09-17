package SiddhiB;

public class ArrayFindMaximumStringLength 

{	
	static String  findMaxlengthName(String [] name)
	{
		int max =0;
		String maxName = "";
		for ( int i =0;i<name.length;i++)
		{
		if (max<name[i].length())
		{
			max = name[i].length();
			maxName = name[i];
			
		}
		}return maxName;
	}

	public static void main(String[] args) 
	
	{
		String names[] = {"Neeraj","Ashutosh","Dimple","Varsha"};
		String maxName = findMaxlengthName(names);
		System.out.println(maxName);

	}

}
