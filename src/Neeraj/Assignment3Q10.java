package Neeraj;

public class Assignment3Q10 {
	int sumNumber1=0;
	int sumNumber2=0;
	int totalSum=0;
	
	int arraySum(int[]number1,int[]number2)
	{
		for(int i=0;i<number1.length; i++)
		{
			sumNumber1+=number1[i];
			
		}
		for(int i=0;i<number2.length;i++)
		{
			sumNumber2+=number2[i];
			
		}
		totalSum=sumNumber1+sumNumber2;
			return totalSum;
		
	}
	
	public static void main(String[] args) {
		int[] number1={1, 5, 9, 3, 7};
		int[] number2={1, 7,  9, 3};
		
		System.out.println(new Assignment3Q10().arraySum(number1,number2));
		
	}

}
