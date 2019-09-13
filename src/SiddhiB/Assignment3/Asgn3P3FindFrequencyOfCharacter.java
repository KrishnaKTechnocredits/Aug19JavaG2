package SiddhiB.Assignment3;

public class Asgn3P3FindFrequencyOfCharacter 
{	static void findFrequencyOfuserDefinedCharacter(String udString, char gCharacter)
	{
	 String [] frequency  = udString.split("e");
	 System.out.println("frequency of character" + gCharacter + "is :" + (frequency.length-1));
	  
	  
	}

	public static void main(String[] args)
	
	{	
		String userDefinedString = "Electrical Engineering";
		char givenCharacter = 'e';
		findFrequencyOfuserDefinedCharacter(userDefinedString,givenCharacter);

	}

}
