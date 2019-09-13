package UserValues;

 public class ClassB extends classA
 {

	A m2()
	{
		System.out.println("Hi");
		A a1 = new A();
		return a1;
	}
	pubic A m3()
	{
		return m2();
	}

}
