package SiddhiB;

public class Asgn2ArrayFindDuplicateNumber
{
	void display(int receivedary [])
	{
		for (int i =0;i<receivedary.length;i++)
		{
			for (int j = i+1;j<receivedary.length;j++)
			{
				if (receivedary [i] == receivedary [j])
				{
					System.out.println("duplicate number is :" + receivedary [i]);
					System.out.println("position of duplicate element is : "+ i +" , " +j);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int ary [] = {1,2,3,3,4};
		Asgn2ArrayFindDuplicateNumber fdn = new Asgn2ArrayFindDuplicateNumber();
		fdn.display(ary);
	}
}
