package SiddhiB;

public class Asgn2ArrayFindLargestSmallestNumber 

{	void identifynumber(int receivedary [])
	{
		for (int i = 0;i<=receivedary.length;i++)
		{
			for (int j = i+1;j<receivedary.length;j++)
			{
				if (receivedary[i]<receivedary[j])
				{
					System.out.println("number " + receivedary[i] + " is smaller than " + receivedary[j]);
					int temp = receivedary[i];
				}
				else 
				{
					System.out.println("number " + receivedary[i] + " is greater than " + receivedary[j]);
				}
			}
		}
	
	}

	public static void main(String[] args) 
	
	{
		int ary [] = {23,15,31,12,7};
		Asgn2ArrayFindLargestSmallestNumber fsln = new Asgn2ArrayFindLargestSmallestNumber();
		fsln.identifynumber(ary);
		

	}

}
