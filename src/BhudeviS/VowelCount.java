package BhudeviS;

public class VowelCount {

	void printVowelCount(String input,char ch)
	{
			int count=0;
		for(int i=0; i<input.length();i++)
		{
			//System.out.println(i);
		//	System.out.println(input.charAt(i));
			if(input.charAt(i)== ch)
			{
				count++;
			}
		}
		System.out.println(ch+ ":"+ count);
	}
	public static void main(String[] args) {
		VowelCount vowelcount = new VowelCount();
		vowelcount.printVowelCount("Technocredits",'a');
		vowelcount.printVowelCount("Technocredits",'e');
		vowelcount.printVowelCount("Technocredits",'i');
		vowelcount.printVowelCount("Technocredits",'o');
		vowelcount.printVowelCount("Technocredits",'u');
	}
}
