package ShivaniG;

//1
//2 4
//3 5 7
//4 6 8 10
import java.util.Scanner;

public class P3 {
	static void pattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				int v = 0;
				if (j == 1) {
					System.out.print(i + " "); // first line must be i, but
												// second iteration k liy we
												// need i+2
				} else {
					v = i + (j - 1) * 2;
					System.out.print(v + " ");
				}
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for pattern : ");
		int num = sc.nextInt();
		pattern(num);
		sc.close();
	}
}
