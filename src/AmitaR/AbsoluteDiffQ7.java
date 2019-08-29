package AmitaR;

class AbsoluteDiffQ7
{
    int m1(int a, int b)
    {
        int diff=a-b;
		System.out.println("the absolute Diff is" +diff);
        {
            if(diff<0)
            {
                diff=diff*(-1);
				System.out.println("The new value of absolute Diff is" +diff);
            }
			else
            {
               System.out.println("the absolute Diff is" +diff);
            }
        }
       return diff;
    }

    public static void main(String[] a)
    {
        int total = new AbsoluteDiffQ7().m1(25,85);
        System.out.println(total);
    }


}