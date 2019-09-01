package BhudeviS;

public class SwitchCase {

	static void SwitchCaseDemo(char ch) {
		switch (ch) {
		case 'A':
			System.out.println("VGOOD");
			break;

		case 'B':
			System.out.println("GOOD");
			break;
		case 'C':
			System.out.println("Bad");
			break;

		case 'D':
			System.out.println("Worse");
			break;

		default:
			System.out.println("Are you sure?");
			break;
		}

	}

	public static void main(String[] args) {
		SwitchCaseDemo('A');
	}
}
