package SiddhiB.Assignment3;

public class Asgn3P4FindSumOfGivenNumber 
{
	static int digitSum(String input){
	int sum=0;
	
	for(int i=0;i<input.length();i++)
	{
		System.out.println(input.charAt(i));
		char currentChar = input.charAt(i);
		String temp = String.valueOf(currentChar);
		int x = Integer.parseInt(temp);
		sum += x;
	} 
	return sum;
}

public static void main(String[] args) {
	int ans = digitSum("159753");
	System.out.println(ans);
}

}
