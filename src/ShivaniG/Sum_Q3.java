package ShivaniG;

class Sum_Q3
{
	static int sum() 
    { 
        int sum = 0;
		int n = 3;
		int arr[] = {6,3,8}; 
		for (int i=0 ; i< n; i++)
		{
			sum +=  arr[i]; 
		}
		
		return sum;
    } 
    
    public static void main(String[] args)  
    { 
  	System.out.println("Sum of given array is " + sum()); 
    } 
 } 
 
        
     