package AmitaR;

public class Assignment2Q2 {
	
	static void print()
	{
		int a[]={1,2,3,3,4,5,6};
		for(int i=0;i<=a.length;i++)
		{
		
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println("duplicate value is  "+ a[j]);
				}

			}
		}
	}

	public static void main(String[] args) {
	print();	

	}

}
