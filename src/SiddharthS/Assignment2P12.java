public class Assignment2P12
{

	public static void main(String args[])
	{
		new Assignment2P13().reverseGivenArray();
	}
	void reverseGivenArray()
	{
	    int[] inputArray1 = {1,2,3,10,14,63};
		int[] inputArray2 = {5,6,9,10,14,63};;
		for(int j=0;j<inputArray1.length;j++)
		{
		    for(int i=0;i<inputArray2.length;i++)
		    {
		        if(inputArray1[j]==inputArray2[i])
		        {
		            System.out.println(inputArray1[i]);
		        }
		    }
		}
		
	}
}