public class Assignment2P14
{
	int[] numArray = {15,24,52,49,62,10};
	public static void main(String args[])
	{
		new Assignment2P14().printEvnNumInArray();
	}
	void printEvnNumInArray()
	{
		for(int i=0;i<numArray.length;i++)
		{
			if(numArray[i]%2==0)
				System.out.println(numArray[i]);
		}
	}
}