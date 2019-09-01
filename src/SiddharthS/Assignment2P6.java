public class Assignment2P6
{
	static int[] numArray1 = {21,57,11,37,24};
	static int[] numArray2 = {21,57,11,37,24};
	static int count = 0;
	
	public static void main(String args[])
	{
		for(int i=0,j=0;i<numArray1.length && j<numArray2.length;i++,j++)
        {
            if(numArray1[i]!=numArray2[j])
            {
                count++;
                if(count != 0)
                {
                    System.out.println("Both the arrays are not equal");
                    //break;
                }
            }    
        }
        if (count==0)
        {
            System.out.println("Both the arrays are equal");
        }
        
	}
}