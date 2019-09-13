package BhudeviS;

public class SumOfNumber {

	void sumofNumber() {
		int sum = 0;
		String number = "159753";

		for (int i = 0; i < number.length(); i++) {
			
			String ch = ""+number.charAt(i); // 5
			int j = Integer.parseInt(ch);
			sum = sum + j;
		}

		System.out.println(sum);

	}

	public static void main(String[] args) {
		SumOfNumber su = new SumOfNumber();
		su.sumofNumber();

	}

}