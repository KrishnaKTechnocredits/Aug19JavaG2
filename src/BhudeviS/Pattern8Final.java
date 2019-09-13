package BhudeviS;

public class Pattern8Final {

	public static void main(String[] args) {
		Pattern8Final(4);

	}

	private static void Pattern8Final(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int k = 1; k <= rows - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + "*");
			}
			System.out.println();

		}

		for (int i = 1; i <= rows - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= rows - i; k++) {
				System.out.print(" " + "*");
			}
			System.out.println();

		}
	}
}