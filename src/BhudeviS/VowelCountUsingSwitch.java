package BhudeviS;

public class VowelCountUsingSwitch {

	static int aCount;
	static int ecount;
	static int icount;
	static int ocount;
	static int ucount;
	
	
	public static void main(String[] args) {
		String input="Technocredits";
		for(int i=0; i<input.length();i++)
		{
			char ch= input.charAt(i);
			switch(ch)
			{
			case'a': 
				aCount++;
				break;
				
			case'e': 
				ecount++;
				break;
				
			case'i': 
				ecount++;
				break;
				
			case'o': 
				ecount++;
				break;
			}
			
		}
		System.out.println("a count is "+ aCount);
		System.out.println("e count is "+ ecount);
		
		
		
	}
}
