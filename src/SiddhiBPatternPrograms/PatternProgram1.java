package SiddhiBPatternPrograms;


/* Print pyramid
 *  	*
  	   * *
  	  * * *
  	 * * * *
  	
  			
  	  * 
    *  * 
   *  *  * 
  *  *  *  * 
 *  *  *  *  * 

  	   1
  	 1 2 1
    1 2 2 1
   1 2 2 2 1
  1 2 2	2 2 1
  	 * */

public class PatternProgram1 
{

	public static void main(String[] args) 
	
	{
		for (int i = 1;i<=4;i++)  //row
		{
			int count = 0;
			for (int j =1;j<=i;j++) //column
			{
				count++;
					System.out.print(" " + count*(i));
			} System.out.println();
				
			}
			
			
		} 
	}
		
