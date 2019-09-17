package SiddhiB;

public class Asgn2ArrayFindUniqueNumber
{
	static void uniqueNumber()
	{
		int [] num1 = {10,13,11,19,13};
		int [] num2	= {18,11,10,29,11};
		int [] outArray = new int [num1.length+num2.length];
		int index = 0;
		for (int i = 0;i<num1.length;i++)
		{
			boolean flag = false;
			for (int j =0;j<outArray.length;j++)
			{
				if (num1[i]==outArray[j])
				{
					flag = true;
					break;
				}
			}
		
		if (flag ==false)
		 {
			outArray[index] = num1[i];
			index++;
		 }

	public static void main(String[] args)

	{
		uniqueNumber();

	}

}
