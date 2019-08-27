package ShivaniG;

class Sum_Q4
{
	static int sum() 
    { 
        int sum = 0;
		int n = 5;
		int arr[] = {4,7,2,8,5}; 
		for (int i=0 ; i< n; i++)
		{
			sum = sum + (arr[i] * arr[i]); 
		}
		
		return sum;
    } 
    
    public static void main(String[] args)  
    { 
       	System.out.println("Sum of given array is " + sum()); 
    } 
 } 