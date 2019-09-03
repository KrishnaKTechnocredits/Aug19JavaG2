package SiddhiB;

public class Asgn2ArrayReverseArray 
{	
	void reverseArray(int receivedary [])
	{
		for (int i=receivedary.length-1;i>=0;i--)
		{
			System.out.print(" "+receivedary[i]);
			
		}
	}
	public static void main(String[] args) 

	{
		int ary [] = {12,23,31,15};
		Asgn2ArrayReverseArray ra = new Asgn2ArrayReverseArray();
		ra.reverseArray(ary);
	}
}
