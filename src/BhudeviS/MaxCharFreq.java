package BhudeviS;

public class MaxCharFreq {
	int maxCount;
	char maxChar;

	void findMaxCharFreq(String input, char ch)
	{
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)== ch)
			{
				count++;
			}
		}
		if(maxCount<count)
		{
			maxCount=count;
			maxChar=ch;
		}
	//	System.out.println(ch+ ":"+ count);
		}
	
	public static void main(String[] args) {
		String input="Technocreditese";
		char ch='e';
		MaxCharFreq charF= new MaxCharFreq();
		for(int i=0;i<input.length();i++)
		{
			charF.findMaxCharFreq(input,input.charAt(i));			
		}
		System.out.println(charF.maxChar + ":"+charF.maxCount);
	}
	}
