package SiddhiB;

public class Asgn2ArrayFindNumberSPresence 
{
	void numberPresent(int receivedary [])
	{
		int num = 7;
		for (int i =0;i<receivedary.length;i++)
		{
			if (num == receivedary[i])
			{
				System.out.println("num is present");
			} 
			else
			System.out.println("number is not present in given array");
			break;
		}
		
	}
	public static void main(String[] args) 
	{
		int ary [] = {1,2,6,8,23};
		Asgn2ArrayFindNumberSPresence anp= new Asgn2ArrayFindNumberSPresence();
		anp.numberPresent(ary);
				

	}

}
