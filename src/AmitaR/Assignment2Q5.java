package AmitaR;

public class Assignment2Q5 {
	
	static void secondLarge()
	{
	 
        int arr[] = {7, 21, 45, 6, 3, 1, 9, 12, 22, 2};
        int firstLarge = 0;
        int secondLarge = 0;
      
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > firstLarge)
            {
                secondLarge= firstLarge;
                firstLarge = arr[i];
            }
            else if(arr[i] > secondLarge)
            {
            	secondLarge= arr[i];
            }                              
        }
     	System.out.println( " Second Largest Number: " + secondLarge);
    }
      
       	
       	public static void main(String[] args)
        {
       		secondLarge();
    }
}
