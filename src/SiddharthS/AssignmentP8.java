package SiddharthS;

class AssignmentP8
{
	String s= "You are given a string S, which comprises English alphabets, determine the count of all the vowels in S";
	int aLetter;
	int eLetter;
	int iLetter;
	int oLetter;
	int uLetter;
	
	public static void main(String arg[])
	{
		new AssignmentP8().printVowelsInSentence();
	}
	void printVowelsInSentence()
	{
		for(int b=0;b<s.length();b++)
		{
			if(s.charAt(b)=='a')
			{
				aLetter++;
			}
			if(s.charAt(b)=='e')
			{
				eLetter++;
			}
			if(s.charAt(b)=='i')
			{
				iLetter++;
			}
			if(s.charAt(b)=='o')
			{
				oLetter++;
			}
			if(s.charAt(b)=='u')
			{
				uLetter++;
			}
		}
		System.out.println("number of a letter vowel present in the string is : "+aLetter);
		System.out.println("number of e letter vowel present in the string is : "+eLetter);
		System.out.println("number of i letter vowel present in the string is : "+iLetter);
		System.out.println("number of o letter vowel present in the string is : "+oLetter);
		System.out.println("number of u letter vowel present in the string is : "+uLetter);
		
	}
}