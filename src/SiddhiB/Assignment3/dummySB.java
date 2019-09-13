package SiddhiB.Assignment3;


public class dummySB {

	static String palindromeString(String input){
		String str = input;
		
		for(int i=0;i<input.length();i++)
		{
			System.out.println(input.charAt(i)); //naman 
			char currentChar = input.charAt(i); //n
			String temp = String.valueOf(currentChar);
			//int x = Integer.parseInt(temp);

			//sum += x;
		} 
		return input;
	}
	
	public static void main(String[] args) {
		String ans = palindromeString("naman");
		System.out.println(ans);
	}
}