package SiddhiB;

public class Asgn2ArrayFindNumberSPresence 
{
	void numberPresent(int receivedary [], int a)
	{	int count = 0;
		for (int i =0;i<receivedary.length;i++)
		{
			System.out.println("value is:" + receivedary[i]);
			if (a == receivedary[i])
			{
				count = count +1;
				System.out.println("number " + a + " is  present in given array");
				break;
				
			}
			 
		} if (count ==0)
			System.out.println("number " + a + " is not present" );
		
	}
	public static void main(String[] args) 
	{
		int ary [] = {1,2,6,8,23};
		int num = 7;
		Asgn2ArrayFindNumberSPresence fnp= new Asgn2ArrayFindNumberSPresence();
		fnp.numberPresent(ary, num);
				

	}

}
