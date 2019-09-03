class Assignment2P1
{
	static int[] num = {1,2,3,4,5,7,8,9,10};
    
    public static void main(String []args)
    {
        for(int i=0,j=1;i<num.length && j<=10;i++,j++)
        {
            if(num[i]!=j)
                {
                    System.out.println("missing number is : "+j);
                    break;
                }    
        }
    }
}