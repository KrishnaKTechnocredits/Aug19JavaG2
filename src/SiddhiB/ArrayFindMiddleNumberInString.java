package SiddhiB;

public class ArrayFindMiddleNumberInString 

{	
	static void printMiddleChar(String name [])
	{
		for (int i = 0;i<name.length;i++) //neeraj
		{
			if (name[i].length()%2 ==0)
			{
				 int index = (name[i].length()/2)-1;
				System.out.println( "characters in given name "+ name[i] + " is "+ name[i].charAt(index));
			}
			//System.out.println("middle character of the name is:" + (name.length()%2));
			if (name[i].length()%2!=0)
			{
				int index1 = (name[i].length()/2);
				System.out.println("Middle character of given name "+ name[i]+ " is :" + name[i].charAt(index1));
			}
		} 
		
	}

	public static void main(String[] args) 
	
	{
		String nameAry [] = {"Neeraj","Ashutosh","Dimple","Varsha","Siddz"};
		printMiddleChar(nameAry);

	}

}
