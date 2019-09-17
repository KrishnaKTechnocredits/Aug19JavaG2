package Neeraj;

public class Assignment3Q13 {

	int numTotal;
	int reminder = 0;

	void armStrong(int number) {
		int orgNumber = number;
		while (number != 0)
		{
			reminder = number % 10;
			number = number / 10;
			numTotal = numTotal + (reminder * reminder * reminder);

		}
		// numTotal=number;

		System.out.println(numTotal);
		if (orgNumber == numTotal) {
			System.out.println(orgNumber + " " + "is" + " " + " ArmStrong" + " " + "number");
		} else {
			System.out.println(number + " " + "isn't" + " " + " ArmStrong" + " " + "number");
		}

	}

	public static void main(String[] args) {
		int number = 153;
		new Assignment3Q13().armStrong(number);
	}

}
