package SiddhiB.Assignment3;

public class Asgn3P8FindVowelInString 
{	
	static void findVowel (String inputstring)
	{	
		int count = 0;
		for (int i = 0;i<inputstring.length();i++)
		{
		 if (inputstring.charAt(i)=='a' || inputstring.charAt(i)=='e' || inputstring.charAt(i)=='i' ||inputstring.charAt(i)=='o' || inputstring.charAt(i)=='u')
		  {
			count++;
	      } 
			
		}
		System.out.println("count of all the vowels in given string is :" + count);
	} 
		

	public static void main(String[] args) 
	{	
		String str = "automation engineering";
		findVowel(str);

	}

}
