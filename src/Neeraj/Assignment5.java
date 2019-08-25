class Assignment5
{
	void display(int x, int y)
	{
		//int d=0;
		for (int i=x;i<=y;i++ ) 
		{
			if(i>=1 && i<=100)
				{
					System.out.print(" " +i);
				}else
				{
					System.out.println("Out of Range");
				}
			
		}
		//return d;
	}

	public static void main(String[] args) {
		Assignment5 assignment5=new Assignment5();
		assignment5.display(5,10);
		//System.out.print("Print the integers between a Ranage:" + (new Assignment5().display(5,10)));
	}
}