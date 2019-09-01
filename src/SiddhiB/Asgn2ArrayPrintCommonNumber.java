package SiddhiB;

public class Asgn2ArrayPrintCommonNumber 
{
	static void display(int x[], int y[])
	{
		for (int i =0;i<x.length;i++ )
		{
			for (int j =0;j<y.length;j++)
			{
				if (x[i]==y[j])
				{
					System.out.println(" " + x[i]);
				}
			}
		}
		
	}
	public static void main(String[] args) 
	{
		int ary1 [] = {11,12,15,23};
		int ary2 [] = {12,31,19,15};
		display(ary1,ary2);
		
		
	}

}
