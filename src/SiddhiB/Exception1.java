package SiddhiB;

public class Exception1 {
	
	void m1(int y)
	{
		
		System.out.println("1");
		int x = 100;
		
		try {	
			int z = x/y;
		}catch (ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Exception1 ex1= new Exception1();
		ex1.m1(0);
		System.out.println("Main end");
		

	}

}
