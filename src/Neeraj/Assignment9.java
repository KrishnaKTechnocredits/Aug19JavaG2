<<<<<<< HEAD
class Assignment9
{
	int count=0;
	void display(String number)
	{
		//12896
		//128896
		for (int i=0;i<number.length() ; i++ ) 
		{		

			for (int j=0;j<number.length() ;j++ ) 
			{

				if(number.charAt(i)==number.charAt(j)) //&& (i!= j))
				{
					count++;

				}
								
			}

				System.out.println("Number of Occurance of " + number.charAt(i) +' '+ "in the string" +' '+ number+' '+ "is " + " " + count);
				count =0; 

		}
			//return count;


		


				
			
			/*if((number.charAt(i)>=0 && number.charAt(i)<=100)) //|| (number.charAt(i)==number.charAt(i)))
			{
				//count = number.charAt(i) + number.charAt(i);
				System.out.println(number.charAt(i));
				//count++; 
			}else if ((number.charAt(i)==number.charAt(i)) && ((number.charAt(i)>1)))
			{
				count = number.charAt(i) + number.charAt(i);
				System.out.println(count);
			}*/	
		
		//return count;
	}

	public static void main(String[] args) 
	{
		Assignment9 assignment9 = new Assignment9();
		assignment9.display("128869");
		//System.out.println("Total:" + new Assignment9().display("128896"));
	}
}

=======
// You are given a string S. Count the number of occurrences of all the digits in the string S. 

package Neeraj;

class Assignment9 {
	int count = 0;

	void display(String number) {
		for (int i = 0; i < number.length(); i++) {

			for (int j = 0; j < number.length(); j++) {

				if (number.charAt(i) == number.charAt(j)) {
					count++;

				}

			}

			System.out.println("Number of Occurance of " + number.charAt(i) + ' ' + "in the string" + ' ' + number + ' '
					+ "is " + " " + count);
			count = 0;

		}

	}

	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.display("128869");

	}
}
>>>>>>> 979f5e5d23c3f87d03b2a83394c3b7f16db0cd50
