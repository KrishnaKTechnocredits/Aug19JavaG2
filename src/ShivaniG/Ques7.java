package ShivaniG;
//WAP to print absolute difference between N amd M
class Ques7 {
	void subtract(int N, int M) {
		double x = N - M;
		if (x < 0) {
			x = x * (-1);
		}
		System.out.println("Difference is : " + x);
	}

	public static void main(String[] args) {
		Ques7 ques7 = new Ques7();
		ques7.subtract(30, 50);
	}
}