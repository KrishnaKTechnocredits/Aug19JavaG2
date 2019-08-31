package SiddhiB;

public class Asgn2ArrayPrintEvenNumber 

{
	 void display(int receivedary[])
	{
		for (int index = 0;index<receivedary.length;index++)
		{
			//System.out.print(receivedary[index]);
			if ((receivedary[index])%2 ==0)
			{
			System.out.println("even numbers is  "+ receivedary[index]);
			}
			} 
		
	}
	public static void main(String[] args)
	
	{
		int ary [] = {15,24,92,23,31,12};
		Asgn2ArrayPrintEvenNumber pen = new Asgn2ArrayPrintEvenNumber();
		pen.display(ary);

	}

}
