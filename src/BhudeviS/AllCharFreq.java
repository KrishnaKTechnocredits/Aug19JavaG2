package BhudeviS;

public class AllCharFreq {

	static void charFreq(String input, char ch)
	{
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==ch)
			{
				count++;
			}
		}
	//	System.out.println(ch + ":" +count);
	}
	
	
	
	public static void main(String[] args) {
		String input="technoncreditsttt";
		for(int index=0;index<input.length();index++)
		{
		//	if(index==input.indexOf(input.charAt(index)))
			char currentChar= input.charAt(index);
			if(index== input.indexOf(currentChar))
			System.out.println(input.charAt(index)+ ":"+ index);
			charFreq(input,input.charAt(index));
		}
	}
}
