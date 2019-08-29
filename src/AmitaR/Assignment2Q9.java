package AmitaR;

public class Assignment2Q9 {
	
	static void diffIndex()
	{
	
	int a[]={10,2,9,14,3};
	int b[]= {10,2,18,14,13};
	
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=b[i])
		{
			count++;
			System.out.println((" Values are not matching at index :  " + i));
		}
	}
	if(count==0)
	{
		System.out.println("Two arrays are equal");
	}
	}
	public static void main(String[] args) {
		diffIndex();

	}

}
