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

public class PatternProgram6 {

	public static void main(String[] args) {
		int maxStart = 5;
		for (int i = 1; i <= 9; i++) 
		{
			if (i <= 5) 
			{
				for (int j = 1; j <= i; j++) {

					System.out.print(" * ");
			
				}
				System.out.println();
			}

			else if (i<=9 && i>=6)
			 { 
				for (int k = i;k<=((maxStart*2)-1);k++)
				{
				//for (int j = k; j >=1; j--) // column
				//{
					System.out.print(" * ");
						
					
				}
				
				System.out.println();
			}
			 }
		
		}
	}
