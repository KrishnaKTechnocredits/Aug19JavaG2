class Assignment3
{
	//int[] n= {33,66,99};
	//int[] sum= new int [3];
	int sum =0;
	 int display(int [] n)
	
	{
		for(int i=0; i<n.length; i++)
		{
			if(n[i]>=1 && n[i]<=100)
			{
				sum=sum + n[i];
				//System.out.println(sum);
							 
			}else 
			{
				System.out.println("Out of range");
				break;
				
			}
			

		}
		return sum;
		//System.out.println(sum);

	}

	public static void main(String[] args) {
		int[] n= {30,60,10};
		
		//Assignment3 assignment3 = new Assignment3();
		//assignment3.display(n);
		//System.out.println("The Sum of Array Element:" + assignment3.sum);
		System.out.println("The Sum of Array Element:" + (new Assignment3().display(n)));
	}
}