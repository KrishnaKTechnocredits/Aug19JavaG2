package SiddhiB;

public class State {
	
	String city = "ABC";
	String Village = "XYZ";

	public static void main(String[] args) {
		new State().city("XYZ");
		new State().Village("ABC");
		new State().display();

	}
	
	private void Village(String city)
	{
		this.Village= city;
	}

	private void city(String Village)
	{
		this.city= Village;
	}

void display()
{
	System.out.println(city + " "+ Village);
}
}

