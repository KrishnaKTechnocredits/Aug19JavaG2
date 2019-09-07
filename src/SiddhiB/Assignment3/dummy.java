package SiddhiB.Assignment3;


public class dummy {

	static int digitSum(String input){
		int sum=0;
		
		for(int i=0;i<input.length();i++)
		{
			System.out.println(input.charAt(i)); //naman 
			char currentChar = input.charAt(i); //n
			String temp = String.valueOf(currentChar);
			int x = Integer.parseInt(temp);

			sum += x;
		} 
		return sum;
	}
	
	public static void main(String[] args) {
		int ans = digitSum("1432");
		System.out.println(ans);
	}
}