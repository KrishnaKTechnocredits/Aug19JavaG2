class Assignment4
{
	int sum=0;
	//int[] num={9,8,7,6};
	int square(int[]num)
	{
		//int[] num={9,8,7,6};
		for (int i=0; i<num.length;i++ ) 
		{
			if(num[i]>=1 && num[i]<=100)
			{
				sum = sum + num[i]*num[i];
			}else
			{
				System.out.println("Out of Range");
			}
			
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] num={9,8,7,106};
		//Assignment4 assignment4= new Assignment4();
		//assignment4.square(num);
		System.out.println("Sum of Square of an Array Element:" + (new Assignment4().square(num)));
	}
}