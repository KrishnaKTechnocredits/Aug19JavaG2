//Find all differ index from given arrays 
package Neeraj;
class Assignment2Q9
{
	static void display(int[] number1, int[] number2)
	{
		for(int i=0; i<number1.length; i++)
		{
			if(number1[i]!=number2[i])
				{
					System.out.println("Array are not mismatching at:" + i);
					
				}
			
		}
	}
	public static void main(String[] args) {
		int[] number1= {10,2,9,14,3};
		int[] number2= {10,2,18,14,13};
		display(number1,number2);

		
	}
}