package BhudeviS;

public class ArrayModularPosition {

	void arrayPosition()
	{
	int a[]= {4,2,7,9,10,12};
	
	for(int i=0; i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println("Array index mod 2 is:"+i);
		}
		
	}
	}	
		
public static void main(String[] args) {
	ArrayModularPosition arrayp= new ArrayModularPosition();
	arrayp.arrayPosition();
}
}
