package SiddhiBPatternPrograms;

/* print below pattern 
		*
	   ** 
	  ***
	 ****
	*****
	 ****
      ***
	   **
	    *
*/

public class PatternProgram7 {

	public static void main(String[] args) 
	{	
		int maxStar = 5;
	 for (int i=1;i<=((maxStar*2)-1);i++)
	 {	
		 if (i>=1 && i<=maxStar)
		 {
		 for (int j=maxStar; j>=1;j--)
		 {
			if (i>=j)
			{
				System.out.print("*");
		    } else {
			 System.out.print(" "); 
		    }
			
		 }System.out.println();
		 
	 } else 
	 {
		 for (int j =(maxStar-1) ; j >= 1; j--) 
		 {
			  if (j<=maxStar)
			  {
				System.out.print("*");
			} 
			  else{
				  System.out.print("1");
			  }
			
			System.out.println("");
		 

	 }}
	 }
	}
}



