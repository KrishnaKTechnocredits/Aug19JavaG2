public class Assignment2P2
{
	static int[] num = {1,2,3,4,5,3,8,9,10};
    
    public static void main(String []args)
    {
    	int count=0;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					{
					    System.out.println(num[i]);
					    break;
					}
				}
			}	
        }
    }
}
