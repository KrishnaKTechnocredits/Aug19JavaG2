package SiddhiB.Assignment3;

public class Asgn3P6FindReverseMaxLengthString 

{	static String findReverseMaxLength (String [] receivedInputString)
	 {	
		int tempmax = 0;
		String maxLengthName = " ";
	      for (int i = 0; i<receivedInputString.length;i++)
		    {
			    if (tempmax < receivedInputString[i].length())
			    {
				  tempmax = receivedInputString[i].length();
				  maxLengthName = receivedInputString[i];
			    } 
			   // System.out.println("max length is " + maxLengthName);
		    } 
	      return maxLengthName;
	    }
		static void reversePrint (String maxLengthName)
		{
			for (int i=((maxLengthName.length())-1);i>0;i--)
			{
				System.out.println("reverseString is" + maxLengthName.charAt(i) );
			}
		}
	public static void main(String[] args) 
	{
		String inputString [] = {"all the best", "technocredits", " ", "maharashtra"};
		System.out.println(findReverseMaxLength(inputString));
		//int length = maxLengthName.length();
		reversePrint(findReverseMaxLength(inputString));

	}

}
