package SiddharthS;

class AssignmentP9
{
	String s="Hi my name is siddharth and my contact details are 919548556561 and alternate contact number is 8833912365 my address details are C6-135,Pashan pune 411057 and my employee id is 262425";
	int num0;
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int num6;
	int num7;
	int num8;
	int num9;
	public static void main(String args[])
	{
		new AssignmentP9().countTotalNumOfDigits();
	}
	void countTotalNumOfDigits()
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='0')
			{
				num0++;
			}
			if(s.charAt(i)=='1')
			{
				num1++;
			}
			if(s.charAt(i)=='2')
			{
				num2++;
			}
			if(s.charAt(i)=='3')
			{
				num3++;
			}
			if(s.charAt(i)=='4')
			{
				num4++;
			}
			if(s.charAt(i)=='5')
			{
				num5++;
			}
			if(s.charAt(i)=='6')
			{
				num6++;
			}
			if(s.charAt(i)=='7')
			{
				num7++;
			}
			if(s.charAt(i)=='8')
			{
				num8++;
			}
			if(s.charAt(i)=='9')
			{
				num9++;
			}
		}
		System.out.println("0 " + num0);
		System.out.println("1 " + num1);
		System.out.println("2 " + num2);
		System.out.println("3 " + num3);
		System.out.println("4 " + num4);
		System.out.println("5 " + num5);
		System.out.println("6 " + num6);
		System.out.println("7 " + num7);
		System.out.println("8 " + num8);	
		System.out.println("9 " + num9);
	}
	
}


// //Doubts

// D:\JavaFileSelenium\Assignments1>javac AssignmentP9.java
// AssignmentP9.java:22: error: incomparable types: char and String
                        // if(s.charAt(i)=="0")
                                      // ^
// AssignmentP9.java:26: error: incomparable types: char and String
                        // if(s.charAt(i)=="1")