class Assignment7
{
	//int x=79;
	//int y=99;

	int sum(int x,int y)
	{
		int diff= x-y;
		//System.out.println(diff);
		if(diff<0)
		{
			diff = diff*(-1);
			System.out.println(diff);
		}
		else
		{
			System.out.println("Difference is absolute");
		}
		return diff;
	}

	public static void main(String[] args) {
		Assignment7 assignment7= new Assignment7();
		assignment7.sum(9,79);
		//System.out.println("Print the Absolute value:" + new Assignment7().sum(79,79));
	}
}