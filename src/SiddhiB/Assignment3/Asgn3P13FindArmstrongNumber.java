package SiddhiB.Assignment3;

public class Asgn3P13FindArmstrongNumber 

{
	static void findArmStrongNumber (String input)
	{			int sum = 0;	
				for(int i=0;i<input.length();i++)
				{
					System.out.println(input.charAt(i));
					char currentChar = input.charAt(i);
					String temp = String.valueOf(currentChar);
					int x = Integer.parseInt(temp);
					int y = x*x*x;
					sum += y;
				}
				
			}
	public static void main(String[] args) 
	{
		String number = "153";
		findArmStrongNumber (number);

	}

}
