package BhudeviS;

public class Manager {
	String name = "Techno";

	void m1() {
		Manager mng = new Manager();
		mng.name = "Maulik";
	}

	public static void main(String[] args) {
		Manager mng = new Manager();
		mng.name = "Harsh";
		mng.m1();
		System.out.println("Value:" + mng.name);
	}
}