package AmitaR;

public class Assignment2Q1 {
	
	static void print()
	{
		int a[]={1,2,4,5,7,8,10};
		int i;
	
		for(i=1;i<=10;i++)
		{
			int count=0;
			//boolean flag=true;
			for( int j=0;j<a.length;j++)
			{
				if(a[j]==i)
				{
				count=1;
				
				//flag=false;
				//break;
				}
			}
				//if(flag==true)
				if(count==0)
				{
				System.out.println("the missing no is  " + i);
				}
				
				}
		}

	public static void main(String[] args) {
	print();
	
	}

}
