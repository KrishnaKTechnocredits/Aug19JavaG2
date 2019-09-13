package UserValues;

 public class B 
 {

	A m2()
	{
		System.out.println("Hi");
		A a1 = new A();
		return a1;
	}
	public A m3()
	{
		return m2();
	}

}
