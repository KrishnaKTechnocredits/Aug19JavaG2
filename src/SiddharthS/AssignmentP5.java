package SiddharthS;

class AssignmentP5
{
	public static void main(String args[])
	{
		new AssignmentP5().listIntLeftToRight(5,10);
	}
	void listIntLeftToRight(int l, int r)
	{
		for(int i=l;i<=r;i++)
			System.out.print(" "+i);
	}
}