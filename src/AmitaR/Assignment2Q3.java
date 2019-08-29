package AmitaR;

public class Assignment2Q3 {
	
	static void displayNumber(int array[],int number)
	{
		boolean flag=true;
			for(int i=0;i<array.length;i++)
				{
					
					if(array[i]==number)
						{
							flag=false;
						}
				}
					if(flag==true)
						{
						System.out.println("The missing no is  "+number );
						}
				}
		
	
	public static void main(String[] args) {
		int a[]={1,2,4,5};
		displayNumber(a,9);

	}

}
