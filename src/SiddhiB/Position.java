package SiddhiB;
class Position
{
	
	int  display(int ary [])
	{
		//int ary [] = {2,4,7,9,10,12};
		for (int i=0;i<ary.length;i++)
		{
			if (i%2 ==0)
			System.out.println("Mod is zero for:" + i);
		}
		return 1;
	}
	

	public static void main (String args[])
	{
	int x [] = {2,4,7,9,10,12};
	
	Position psn = new Position();
	//psn.display((x));
	 System.out.println(psn.display(x));
	//System.out.println(x);
	}
}
